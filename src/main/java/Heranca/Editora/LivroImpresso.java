package Heranca.Editora;

public class LivroImpresso extends LivroSC {

    private double AcreValor;

    public LivroImpresso(double acreValor) {
        AcreValor = acreValor;
    }

    public double getAcreValor() {
        return AcreValor;
    }

    public void setAcreValor(double acreValor) {
        AcreValor = acreValor;
    }

    @Override
    public boolean validaLivro() {
        if(this.getAcreValor() == 0) {
            return false;
        } else{
            return true;
        }
    }
}
