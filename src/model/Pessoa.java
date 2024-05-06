package model;

public abstract class Pessoa {
    private String nome;
    private String endereco;
    private String email;
    private String telefone;

    public Pessoa(String nome, String endereco, String email, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String mail) {
        this.email = mail;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String tefone) {
        this.telefone = tefone;
    }
}