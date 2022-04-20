package Heranca.Humano;

public class Aluno extends SerHumanoSC {

    private Integer matriculaAluno;
    private String curso;
    private String turno;
    private int periodo;

    public Aluno(Integer matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public int getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(int matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }


    @Override // Metodo valida matricula
    public boolean ValidaCodigo() {
        if(this.matriculaAluno == null){
            return false;
        }else {
            return true;
        }
    }
}
