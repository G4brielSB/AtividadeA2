package br.com.biblioteca.repositorio;

import java.util.List;

public abstract class BaseRepositorio<TTiltado> implements IBaseRepositorio<TTiltado> {

    protected List<TTiltado> tabela;

    @Override
    public List<TTiltado> Read() {
        return this.tabela;
    }

    @Override
    public TTiltado Delete(int chave) {
        TTiltado original = this.Read(chave);
        if (original != null) {
            this.tabela.remove(original);
        }
        return original;
    }

}
