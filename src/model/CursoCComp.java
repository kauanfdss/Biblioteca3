package model;

public class CursoCComp extends Cursos{

    private Aluno aluno;
    private  String nomeCurso;

    public CursoCComp(String nome, String codigoCurso,Aluno aluno,String nomeCurso) {
        super(nome, codigoCurso);
        this.aluno = aluno;
        this.nomeCurso = nomeCurso;


    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
