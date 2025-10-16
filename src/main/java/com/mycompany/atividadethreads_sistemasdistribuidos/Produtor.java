package com.mycompany.atividadethreads_sistemasdistribuidos;

public class Produtor extends Thread {
    private Deposito deposito;
    private int tempo;

    public Produtor(Deposito deposito, int tempo) {
        this.deposito = deposito;
        this.tempo = tempo;
    }

    @Override
    public void run() {
        // O produtor deve produzir 100 caixas
        for (int i = 0; i < 100; i++) {
            deposito.colocar();
            System.out.println("Produziu! Itens no depósito: " + deposito.getNumItens());
            try {
                // Dorme pelo tempo especificado
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}