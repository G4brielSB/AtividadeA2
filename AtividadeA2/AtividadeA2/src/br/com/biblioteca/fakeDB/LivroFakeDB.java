package br.com.biblioteca.fakeDB;

import java.time.LocalDate;

import br.com.biblioteca.dominio.Livro;

public class LivroFakeDB extends BaseFakeDB<Livro> {

    @Override
    public void AutoFill() {
        this.tabela.add(new Livro(10, "Terror cósmico", LocalDate.now(), "48947", 510, "A genitália assasina,", 1000));
        this.tabela.add(new Livro(10, "Suspense Steampunk", LocalDate.now(), "54984", 500, "Aço e sangue", 1010));
        this.tabela.add(new Livro(10, "Drama +18", LocalDate.now(), "78984", 520, "50 tons de chorume", 1020));

    }

}
