package br.com.biblioteca.teste;

import br.com.biblioteca.servico.BaseServico;

public abstract class BaseTeste<Tgenerico> implements IBaseTeste<Tgenerico> {

    protected BaseServico<Tgenerico> servico;

    public BaseTeste() {

    }

    protected abstract int TestarCriacao();

    protected abstract void TestarLeitura(int chave);

    protected abstract void TestarLeituraVarios();

    protected abstract void TestarAlteracao(int chave);

    protected abstract void TestarExclusao(int chave);

}
