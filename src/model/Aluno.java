package model;

public class Aluno extends Pessoa {
    private String matricula;
    private String periodo;
    private String curso;


    public Aluno(String email, String endereco, String nome, String telefone, String matricula, String periodo, String curso) {
        super(email, endereco, nome, telefone);
        this.periodo = periodo;
        this.matricula = matricula;
        this.curso = curso;



    }
    public Aluno() {

    }



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
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}