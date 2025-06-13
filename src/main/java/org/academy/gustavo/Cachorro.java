package org.academy.gustavo;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade, String raca, int donoId) {
        super(nome, idade, raca,"Cachorro", donoId);
    }

    @Override
    public void emitirSom(){
        System.out.println("au au!");
    }

}
