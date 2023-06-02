package br.com.biblioteca.servico;

import java.util.List;

public interface IBaseServico<TDadoEmCasa> {

    TDadoEmCasa Criar(TDadoEmCasa obj);

    TDadoEmCasa Ler(int chave);

    List<TDadoEmCasa> Ler();

    TDadoEmCasa Atualizar(TDadoEmCasa obj);

    TDadoEmCasa Deletar(int chave);

}
