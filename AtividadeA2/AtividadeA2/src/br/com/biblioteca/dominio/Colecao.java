package br.com.biblioteca.dominio;

import java.time.LocalDate;
import java.util.List;

public class Colecao extends BaseBiblioteca {

    private String editora;

    private List<Livro> livros;

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livro) {
        this.livros = livro;
    }

    public Colecao() {

    }

    public Colecao(int codigo, String descricao, LocalDate dataCadastro, String editora) {
        super(codigo, descricao, dataCadastro);
        this.editora = editora;
    }

    @Override
    public void imprimir() {
        System.out.println("##Coleção##");
        System.out.println("Código coleção: " + this.codigo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Editora: " + this.editora);

    }

    @Override
    public String toString() {
        return "Colecao [editora=" + editora + "código" + codigo + "descricao=" + descricao +
                "dataCadastro=" + dataCadastro + "]";

    }

}
