package model.personagens;

import java.util.ArrayList;
import java.util.HashMap;

import model.ferramentas.Ferramenta;
import model.itens.Item;
import model.interfaces.Lutavel;
import exceptions.FerramentaLimiteException;

public class Heroi implements Lutavel {

    private String nome;
    private Atributos atributos;

    private Ferramenta ferramenta1;
    private Ferramenta ferramenta2;

    private HashMap<String, Item> mochila;

    public Heroi(String nome, int forca, int vida) {
        this.nome = nome;
        this.atributos = new Atributos(forca, vida);
        this.mochila = new HashMap<>();
    }

    public void adicionarFerramenta(Ferramenta f) throws FerramentaLimiteException {
        if (ferramenta1 == null) {
            ferramenta1 = f;
        } else if (ferramenta2 == null) {
            ferramenta2 = f;
        } else {
            throw new FerramentaLimiteException("O herói só pode carregar duas ferramentas!");
        }
    }

    public void adicionarItem(Item item) {
        mochila.put(item.getNome(), item);
    }

    public Item pegarItem(String nome) {
        return mochila.get(nome);
    }

    @Override
    public void atacar(Lutavel inimigo) {
        int dano = atributos.getForca();
        if (ferramenta1 != null) dano += ferramenta1.getPoder();
        if (ferramenta2 != null) dano += ferramenta2.getPoder();

        System.out.println(nome + " ataca com " + dano + " de dano!");
        inimigo.receberDano(dano);
    }

    @Override
    public void receberDano(int dano) {
        atributos.setVida(atributos.getVida() - dano);
        System.out.println(nome + " recebeu " + dano + " de dano! Vida atual: " + atributos.getVida());
    }

    @Override
    public int getVida() {
        return atributos.getVida();
    }

    @Override
    public String getNome() {
        return nome;
    }
}