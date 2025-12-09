package service;

import model.interfaces.Lutavel;

public class BatalhaService {

    public void iniciarBatalha(Lutavel heroi, Lutavel vilao) {

        System.out.println("\n A batalha começa");

        while (heroi.getVida() > 0 && vilao.getVida() > 0) {
            heroi.atacar(vilao);

            if (vilao.getVida() <= 0) break;

            vilao.atacar(heroi);
        }

        System.out.println("\n Resultado");
        if (heroi.getVida() > 0)
            System.out.println(heroi.getNome() + " venceu!");
        else
            System.out.println(vilao.getNome() + " venceu");
    }

}
