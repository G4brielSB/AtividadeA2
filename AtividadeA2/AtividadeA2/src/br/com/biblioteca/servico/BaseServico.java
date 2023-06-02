package br.com.biblioteca.servico;

import br.com.biblioteca.repositorio.BaseRepositorio;

public abstract class BaseServico<TDadoEmCasa> implements IBaseServico<TDadoEmCasa> {

    protected BaseRepositorio<TDadoEmCasa> repositorio;

    public BaseServico() {

    }

}
