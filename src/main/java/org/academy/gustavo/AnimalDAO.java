package org.academy.gustavo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AnimalDAO {
    public void salvar(Animal animal){
        String sql = "INSERT INTO animal (nome, idade, raca, tipo, dono_id) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, animal.getNome());
            stmt.setInt(2, animal.getIdade());
            stmt.setString(3, animal.getRaca());
            stmt.setString(4, animal.getTipo());
            stmt.setInt(5, animal.getDonoId()); // ou animal.getDono().getId()

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
    }
}
}
