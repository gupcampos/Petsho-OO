package org.academy.gustavo;

import java.time.LocalDate;

public class Atendimento {
    private Animal animal;
    private Dono dono;
    private Servico servico;
    private Funcionario funcionario;
    private LocalDate data;

    public Atendimento(Animal animal, Dono dono, Servico servico, Funcionario funcionario, LocalDate data) {
        this.animal = animal;
        this.dono = dono;
        this.servico = servico;
        this.funcionario = funcionario;
        this.data = data;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
