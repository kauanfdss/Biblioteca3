package model;

public class Bibliotecario extends Pessoa {
    private String codigo;

    public Bibliotecario(String mail, String endereco, String nome, String tefone, String codigo) {
        super(mail, endereco, nome, tefone);
        this.codigo = codigo;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
