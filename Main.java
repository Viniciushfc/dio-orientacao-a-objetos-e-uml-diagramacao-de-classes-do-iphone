package br.com.viniciushfc;

import br.com.viniciushfc.aparelho.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Funcionalidades do Aparelho Telefonico");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorrerioVoz();

        System.out.println("---------------------------------------");
        System.out.println("Funcionalidades do Reprodutor Músical");
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();

        System.out.println("---------------------------------------");
        System.out.println("Funcionalidades do Navegador de Internet");
        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.atualizarPagina();
    }
}