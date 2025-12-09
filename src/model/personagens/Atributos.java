package model.personagens;

public class Atributos {
    private int forca;
    private int vida;

    public Atributos(int forca, int vida) {
        this.forca = forca;
        this.vida = vida;
    }

    public int getForca() { return forca; }
    public int getVida() { return vida; }
    public void setVida(int vida) { this.vida = vida; }

}
