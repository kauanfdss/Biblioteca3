package model;

public abstract class Pessoa {
    private String nome;
    private String endereco;
    private String mail;
    private String tefone;

    public Pessoa(String mail, String endereco, String nome, String tefone) {
        this.mail = mail;
        this.endereco = endereco;
        this.nome = nome;
        this.tefone = tefone;
    }
}
