package model;

public abstract class BibliotecaGeral {
    private String nome;
    private String endereco;

    public BibliotecaGeral(String endereco, String nome) {
        this.endereco = endereco;
        this.nome = nome;
    }
}
