package Heranca.Editora;

public class LivroDigital extends  LivroSC {

    private String marcaDaAgua;

    public LivroDigital(String marcaDaAgua) {
        super();
        this.marcaDaAgua = marcaDaAgua;
    }

    public String getMarcaDaAgua() {
        return marcaDaAgua;
    }

    public void setMarcaDaAgua(String marcaDaAgua) {
        this.marcaDaAgua = marcaDaAgua;
    }

    @Override
    public boolean validaLivro() {
        if(this.marcaDaAgua == null) {
            return false;
        } else{
            return true;
        }
    }
}
