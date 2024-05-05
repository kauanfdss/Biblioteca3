package model;

public abstract class Cursos {
    private String nome;
    private String codigoCurso;

    public Cursos(String nome, String codigoCurso) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
    }
}
