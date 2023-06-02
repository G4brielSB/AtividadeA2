import br.com.biblioteca.dominio.Autor;
import br.com.biblioteca.dominio.Colecao;
import br.com.biblioteca.dominio.Livro;
import br.com.biblioteca.fakeDB.*;

public class testeFakeDB {

    public static void main(String[] args) {

        LivroFakeDB livrinho = new LivroFakeDB();

        for (Livro c : livrinho.getTabela()) {

            System.out.println(c.toString());
        }

        ColecaoFakeDB colection = new ColecaoFakeDB();

        for (Colecao b : colection.getTabela()) {

            System.out.println(b.toString());
        }

        AutorFakeDB autoria = new AutorFakeDB();

        for (Autor a : autoria.getTabela()) {

            System.out.println(a.toString());

        }

    }
}
