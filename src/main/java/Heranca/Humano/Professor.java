package Heranca.Humano;

public class Professor extends SerHumanoSC { // herda a Super classe SerHumanoSC tendo poder encima das subClasses

    private Integer matriculaProfessor;
    private String formacao;
    private String curso;
    private int nrHoras;

    public int getMatriculaProfessor() {
        return matriculaProfessor;
    }

    public void setMatriculaProfessor(int matriculaProfessor) {
        this.matriculaProfessor = matriculaProfessor;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNrHoras() {
        return nrHoras;
    }

    public void setNrHoras(int nrHoras) {
        this.nrHoras = nrHoras;
    }


    @Override // Metodo valida matricula
    public boolean ValidaCodigo() {
        if(this.matriculaProfessor == null){
            return false;
        }else {
            return true;
        }
    }
}
