package model;

public class Aluno extends Pessoa{
    private String matricula;
    private String periodo;


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Aluno(String mail, String endereco, String nome, String tefone, String matricula, String periodo) {
        super(mail, endereco, nome, tefone);
        this.periodo = periodo;
        this.matricula = matricula;


    }
}
