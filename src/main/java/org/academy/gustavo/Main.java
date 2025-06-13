package org.academy.gustavo;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cadastro do Dono
        System.out.println("=== Cadastro de Dono ===");
        System.out.print("Nome do dono: ");
        String nomeDono = scanner.nextLine();

        System.out.print("Telefone do dono: ");
        String telefoneDono = scanner.nextLine();

        Dono dono = new Dono(nomeDono, telefoneDono);
        DonoDAO donoDAO = new DonoDAO();
        int donoId = donoDAO.salvar(dono);

        if (donoId == -1) {
            System.out.println("Erro ao cadastrar o dono. Encerrando...");
            return;
        }

        System.out.println("Dono cadastrado com ID: " + donoId);

        // Cadastro do Animal
        System.out.println("\n=== Cadastro de Animal ===");
        System.out.print("Tipo de animal (1 - Cachorro | 2 - Gato): ");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        System.out.print("Nome do animal: ");
        String nomeAnimal = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        System.out.print("Raça: ");
        String raca = scanner.nextLine();

        Animal animal = null;

        switch (tipo) {
            case 1:
                animal = new Cachorro(nomeAnimal, idade, raca, donoId);
                break;
            case 2:
                animal = new Gato(nomeAnimal, idade, raca, donoId);
                break;
            default:
                System.out.println("Tipo inválido.");
                return;
        }

        AnimalDAO animalDAO = new AnimalDAO();
        animalDAO.salvar(animal);

        System.out.println("Animal cadastrado com sucesso!");
        scanner.close();
    }
    }