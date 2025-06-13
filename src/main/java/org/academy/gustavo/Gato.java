package org.academy.gustavo;

public class Gato extends Animal{
    public Gato (String nome, int idade, String raca, int donoId){
        super(nome, idade, raca,"Gato", donoId);
    }

    @Override
    public void emitirSom(){
        System.out.println("miau miau");
    }
}
