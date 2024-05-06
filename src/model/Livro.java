package model;

import java.time.LocalDate;

public class Livro {
    private String genero;
    private String titulo;
    private String autor;
    private LocalDate dataPublicacao;

    public Livro(String genero, String titulo, String autor, LocalDate dataPublicacao) {
        this.genero = genero;
        this.titulo = titulo;
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
    }

    public Livro(String genero, String titulo, String autor, String dataPublicacao, String dataDevolucao) {
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    }


