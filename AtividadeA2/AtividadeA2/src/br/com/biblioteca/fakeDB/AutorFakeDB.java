package br.com.biblioteca.fakeDB;

import java.time.LocalDate;

import br.com.biblioteca.dominio.Autor;

public class AutorFakeDB extends BaseFakeDB<Autor> {

    @Override
    public void AutoFill() {

        this.tabela.add(new Autor(500, "Autor de renomados SciFi", LocalDate.now(), "Owell", "Asimov"));
        this.tabela.add(new Autor(510, "Autora de obras chorumadas", LocalDate.now(), "Jhonatan", "Rolling"));
        this.tabela.add(new Autor(520, "Autor de obras 'quentes' ", LocalDate.now(), "Michael", "Hot"));

    }

}
