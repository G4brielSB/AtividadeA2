package br.com.biblioteca.repositorio;

import java.util.List;

public interface IBaseRepositorio<TTiltado> {

    TTiltado Create(TTiltado obj);

    TTiltado Read(int chave);

    List<TTiltado> Read();

    TTiltado Update(TTiltado obj);

    TTiltado Delete(int chave);

}
