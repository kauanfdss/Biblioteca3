package model;

import java.util.Scanner;

import static model.Cadastrar.cadastrarAluno;
import static model.Cadastrar.listarAlunos;

public class Menu {


    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Listar Alunos Cadastrados");
            System.out.println("3. Cadastrar Bibliotecário");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    listarAlunos();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 4);

        sc.close();
    }

}