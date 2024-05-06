package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastrar  {
    static List<Aluno> alunosCadastrados = new ArrayList<>();

    public  static void cadastrarAluno() {
        Scanner sc = new Scanner(System.in);

        System.out.println("CADASTRAMENTO DE ALUNO");


        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.print("Digite o endereço do aluno: ");
        String endereco = sc.nextLine();
        System.out.print("Digite o e-mail do aluno: ");
        String email = sc.nextLine();
        System.out.print("Digite o telefone do aluno: ");
        String telefone = sc.nextLine();
        System.out.print("Digite a matrícula do aluno: ");
        String matricula = sc.nextLine();
        System.out.print("Digite o período do aluno: ");
        String periodo = sc.nextLine();
        System.out.print("Digite o curso do aluno: ");
        String curso = sc.nextLine();

        Aluno novoAluno = new Aluno(
                nome,
                endereco,
                email,
                telefone,
                matricula,
                periodo,
                curso);



        alunosCadastrados.add(novoAluno);

        System.out.println("Aluno cadastrado com sucesso!");


    }
    public static void listarAlunos() {

        for (int i = 0; i < alunosCadastrados.size(); i++) {
            Aluno aluno = alunosCadastrados.get(i);
            System.out.println("DADOS DO ALUNO " + (i + 1) + ":");
            System.out.println("--".repeat(20));
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Endereço: " + aluno.getEndereco());
            System.out.println("E-mail: " + aluno.getEmail());
            System.out.println("Telefone: " + aluno.getTelefone());
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.println("Período: " + aluno.getPeriodo());
            System.out.println("Curso: " + aluno.getCurso());
            System.out.println("--".repeat(20));
        }
    }

}
