package model.personagens;

import model.interfaces.Lutavel;

public class Vilao implements Lutavel {

    private String nome;
    private Atributos atributos;

    public Vilao(String nome, int forca, int vida) {
        this.nome = nome;
        this.atributos = new Atributos(forca, vida);
    }

    @Override
    public void atacar(Lutavel inimigo) {
        int dano = atributos.getForca();
        System.out.println(nome + " ataca com " + dano + " de dano!");
        inimigo.receberDano(dano);
    }

    @Override
    public void receberDano(int dano) {
        atributos.setVida(atributos.getVida() - dano);
        System.out.println(nome + " sofreu " + dano + " de dano! Vida atual: " + atributos.getVida());
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