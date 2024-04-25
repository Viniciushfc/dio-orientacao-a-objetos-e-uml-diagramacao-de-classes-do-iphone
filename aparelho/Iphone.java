package br.com.viniciushfc.aparelho;

import br.com.viniciushfc.funcionalidades.AparelhoTelefonico;
import br.com.viniciushfc.funcionalidades.NavegadorInternet;
import br.com.viniciushfc.funcionalidades.ReprodutorMusical;

public class Iphone extends AparelhoTelefonico implements ReprodutorMusical, NavegadorInternet {

    @Override
    public void ligar() {
        System.out.println("Ligando o Iphone!");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo!!");
    }


    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Iniciando correio de voz!");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a música!");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando a música!");
    }


    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a Pagina!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando outra aba!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina!");
    }
}
