package com.mycompany.atividadethreads_sistemasdistribuidos;

public class Consumidor extends Thread {
    private Deposito deposito;
    private int tempo; // Tempo de espera entre consumos

    public Consumidor(Deposito deposito, int tempo) {
        this.deposito = deposito;
        this.tempo = tempo;
    }

    @Override
    public void run() {
        // Cada consumidor deve consumir 20 caixas no total [cite: 53]
        for (int i = 0; i < 20; i++) {
            deposito.retirar(); // Retira uma caixa [cite: 51]
            System.out.println("Consumiu! Itens no depósito: " + deposito.getNumItens());
            try {
                // Espera um tempo antes de consumir a próxima [cite: 52]
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}