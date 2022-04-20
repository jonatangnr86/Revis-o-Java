package Heranca.Editora;

public abstract class LivroSC {

    private Integer isbn;
    private String titulo;
    private String autor;
    private double valorLivro;

    public LivroSC() {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.valorLivro = valorLivro;
    }

    public  abstract boolean validaLivro();

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getValorLivro() {
        return valorLivro;
    }

    public void setValorLivro(double valorLivro) {
        this.valorLivro = valorLivro;
    }

}
