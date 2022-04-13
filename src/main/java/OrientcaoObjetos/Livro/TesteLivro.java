package OrientcaoObjetos.Livro;

import javax.swing.*;
import javax.swing.plaf.basic.BasicGraphicsUtils;

public class TesteLivro {
        public static void main (String[]args){
            Livro livro1 = new Livro();
            livro1.setIsbn("445454");
            livro1.setNome("Java");
            livro1.setNrPagina(588);

            livro1.setEditora(new Editora("454","Nova era"));

            Autor autor1 = new Autor();
            autor1.setCpf("4857456465");
            autor1.setNome("João");

            Autor autor2 = new Autor();
            autor2.setCpf("66666");
            autor2.setNome("Antonio");

            livro1.setAutorPrincipal(autor1);

            livro1.getAutoresDoLivro().add(autor2);

            System.out.println("Livro " + livro1);
            System.out.println("Autor principal " + livro1.getAutorPrincipal());
            for (Autor a : livro1.getAutoresDoLivro()) {
                System.out.println("outros autores " + a);
            }
        }
}

