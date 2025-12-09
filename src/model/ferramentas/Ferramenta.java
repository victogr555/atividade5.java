package model.ferramentas;

public abstract class Ferramenta {
    private String nome;
    private int poder;

    public Ferramenta(String nome, int poder) {
        this.nome = nome;
        this.poder = poder;
    }

    public String getNome() { return nome; }
    public int getPoder() { return poder; }
}