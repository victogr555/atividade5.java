package app;

import model.personagens.*;
import model.ferramentas.*;
import model.itens.*;
import service.BatalhaService;
import exceptions.FerramentaLimiteException;

public class Main {

    public static void main(String[] args) {
        try {
            Heroi arthan = new Heroi("Arthan", 30, 120);
            Vilao nahtar = new Vilao("Nahtar", 25, 150);

            arthan.adicionarFerramenta(new Espada());
            arthan.adicionarFerramenta(new Escudo());
            // arthan.adicionarFerramenta(new Arco()); // GERARIA EXCEÇÃO

            arthan.adicionarItem(new Pocao());
            arthan.adicionarItem(new Mapa());
            arthan.adicionarItem(new Chave());

            BatalhaService batalha = new BatalhaService();
            batalha.iniciarBatalha(arthan, nahtar);

        } catch (FerramentaLimiteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}