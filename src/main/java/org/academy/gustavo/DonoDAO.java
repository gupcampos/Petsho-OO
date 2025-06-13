package org.academy.gustavo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DonoDAO {
    public int salvar(Dono dono) {
        String sql = "INSERT INTO dono (nome, telefone) VALUES(?, ?) RETURNING id";
        int idGerado = -1;
        try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, dono.getNome());
            stmt.setString(2, dono.getTelefone());

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                idGerado = rs.getInt("id");
            }

           // stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return idGerado;
    }

}
