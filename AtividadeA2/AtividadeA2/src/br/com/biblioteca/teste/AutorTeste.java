package br.com.biblioteca.teste;

import java.time.LocalDate;

import java.util.List;

import br.com.biblioteca.dominio.Autor;

import br.com.biblioteca.servico.AutorServico;

public class AutorTeste extends BaseTeste<Autor> {

    public AutorTeste() {
        this.servico = new AutorServico();

    }

    @Override
    public void Executar() {

        int valorChave = this.TestarCriacao();
        this.TestarAlteracao(valorChave);
        this.TestarExclusao(valorChave);
        // this.TestarLeitura();
        // this.TestarLeituraVarios();
    }

    @Override
    protected int TestarCriacao() {

        System.out.println("Criando...");
        Autor aut = new Autor(2000, "Cansado", LocalDate.now(), "Gabrielinho", "Da Silva Sauro");
        Autor novo = this.servico.Criar(aut);
        System.out.println(novo.toString());
        return novo.getCodigo();

    }

    @Override
    protected void TestarLeitura(int chave) {

        Autor aut = this.servico.Ler(chave);
        System.out.println(aut.toString());
    }

    @Override
    protected void TestarLeituraVarios() {

        List<Autor> lista = this.servico.Ler();

        for (Autor aut : lista) {
            System.out.println(aut.toString());
        }

    }

    @Override
    protected void TestarAlteracao(int chave) {

        System.out.println("Alterando...");
        Autor antigo = this.servico.Ler(chave);
        antigo.setDescricao("Abublebinho");
        Autor alterada = this.servico.Atualizar(antigo);
        System.out.println(alterada.toString());
    }

    @Override
    protected void TestarExclusao(int chave) {

        System.out.println("Excluindo...");
        Autor alvo = this.servico.Ler(chave);
        Autor excluido = this.servico.Deletar(alvo.getCodigo());
        System.out.println(excluido.toString());

    }

}
