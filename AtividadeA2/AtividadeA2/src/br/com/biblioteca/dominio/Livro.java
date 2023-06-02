package br.com.biblioteca.dominio;

import java.time.LocalDate;

public class Livro extends BaseBiblioteca {

    private String codigoISBN;
    private int codigoAutor;
    private String titulo;
    private int codigoColecao;

    public String getCodigoISBN() {
        return codigoISBN;
    }

    public void setCodigoISBN(String codigoISBN) {
        this.codigoISBN = codigoISBN;
    }

    public int getCodigoAutor() {
        return codigoAutor;
    }

    public void setCodigoAutor(int codigoAutor) {
        this.codigoAutor = codigoAutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigoColecao() {
        return codigoColecao;
    }

    public void setCodigoColecao(int codigoColecao) {
        this.codigoColecao = codigoColecao;
    }

    public Livro() {

    }

    public Livro(int codigo, String descricao, LocalDate dataCadastro, String codigoISBN, int codigoAutor,
            String titulo, int codigoColecao) {
        super(codigo, descricao, dataCadastro);
        this.codigoISBN = codigoISBN;
        this.codigoAutor = codigoAutor;
        this.titulo = titulo;
        this.codigoColecao = codigoColecao;
    }

    @Override
    public String toString() {
        return "Livro [codigoISBN=" + codigoISBN + ", codigoAutor=" + codigoAutor +
                ", titulo=" + titulo + "Colecao=" + codigoColecao + "]";
    }

    @Override
    public void imprimir() {

        System.out.println("Código ISBN: " + this.codigoISBN);
        System.out.println("Código Autor: " + this.codigoAutor);
        System.out.println("Título Livro: " + this.titulo);
        System.out.println("Código Livro: " + this.codigo);
        System.out.println("Descrição Livro: " + this.descricao);
        System.out.println("Data do cadastro: " + this.dataCadastro);
        System.out.println("Código Coleção: " + this.codigoColecao);

    }

}
