package OrientcaoObjetos.Livro;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Livro {
    private String isbn;
    private String nome;
    private int nrPagina;
    private Autor autorPrincipal;
    private List<Autor> autoresDoLivro;
    private Editora editora;

    public Livro() {
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNrPagina() {
        return nrPagina;
    }

    public void setNrPagina(int nrPagina) {
        this.nrPagina = nrPagina;
    }

    public Autor getAutorPrincipal() {
        return autorPrincipal;
    }

    public void setAutorPrincipal(Autor autorPrincipal) {
        this.autorPrincipal = autorPrincipal;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public List<Autor> getAutoresDoLivro() {
        if (autoresDoLivro == null) {
            autoresDoLivro = new ArrayList<>();
        }
        return autoresDoLivro;
    }

    public void setAutoresDoLivro(List<Autor> autoresDoLivro) {
        this.autoresDoLivro = autoresDoLivro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livro)) return false;
        Livro livro = (Livro) o;
        return Objects.equals(getIsbn(), livro.getIsbn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIsbn());
    }

    @Override
    public String toString() {
        return "Livro{" +
                "isbn='" + isbn + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}