package org.academy.gustavo;

public abstract class Animal {
        private String nome;
        private int idade;
        private String raca;
        private String tipo;
        private int donoId;

    public Animal(String nome, int idade, String raca, String tipo, int donoId) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.tipo= tipo;
        this.donoId= donoId;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDonoId() {
        return donoId;
    }

    public void setDonoId(int donoId) {
        this.donoId = donoId;
    }

    public abstract void emitirSom();
}
