package service;

import model.interfaces.Lutavel;

public class BatalhaService {

    public void iniciarBatalha(Lutavel heroi, Lutavel vilao) {

        System.out.println("\n=== A BATALHA COMEÇA ===");

        while (heroi.getVida() > 0 && vilao.getVida() > 0) {
            heroi.atacar(vilao);

            if (vilao.getVida() <= 0) break;

            vilao.atacar(heroi);
        }

        System.out.println("\n=== RESULTADO ===");
        if (heroi.getVida() > 0)
            System.out.println(heroi.getNome() + " venceu!");
        else
            System.out.println(vilao.getNome() + " venceu...");
    }
}