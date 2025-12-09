package model.interfaces;

public interface Lutavel {
    void atacar(Lutavel inimigo);
    void receberDano(int dano);
    int getVida();
    String getNome();
}
