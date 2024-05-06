package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroLivros {
    private List<Livro> listaLivros;

    public CadastroLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivros() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adicionar Livro");

        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Autor: ");
        String autor = scanner.nextLine();

        System.out.print("Gênero: ");
        String genero = scanner.nextLine();

        System.out.print("Data de Publicação (AAAA-MM-DD): ");
        String dataPublicacaoStr = scanner.nextLine();
        LocalDate dataPublicacao = LocalDate.parse(dataPublicacaoStr);

        Livro livro = new Livro(genero, titulo, autor, dataPublicacao);
        listaLivros.add(livro);


        System.out.println("Livro adicionado com sucesso!");

        scanner.close();
    }

    public static void main(String[] args) {
        CadastroLivros cadastroLivro = new CadastroLivros();
        cadastroLivro.adicionarLivros();
    }
}



