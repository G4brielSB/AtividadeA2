package br.com.biblioteca.fakeDB;

import java.time.LocalDate;

import br.com.biblioteca.dominio.Colecao;

public class ColecaoFakeDB extends BaseFakeDB<Colecao> {

    @Override
    public void AutoFill() {

        this.tabela.add(new br.com.biblioteca.dominio.Colecao(1000, "As piores obras de terror", LocalDate.now(),
                "Picareta edit"));
        this.tabela.add(
                new br.com.biblioteca.dominio.Colecao(1010, "Renomados punkstyles", LocalDate.now(), "Magnum opus"));
        this.tabela
                .add(new br.com.biblioteca.dominio.Colecao(1020, "Dramas picantes", LocalDate.now(), "SIMP magazine"));

    }

}
