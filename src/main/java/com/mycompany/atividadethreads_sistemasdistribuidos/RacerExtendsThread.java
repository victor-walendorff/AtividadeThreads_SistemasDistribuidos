package com.mycompany.atividadethreads_sistemasdistribuidos;

public class RacerExtendsThread extends Thread {

    private int id;

    public RacerExtendsThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        // Laço que executa exatamente 1000 vezes e depois termina
        for (int i = 0; i < 1000; i++) {
            System.out.println("Racer " + this.id + " - imprimindo");
        }
        // Mensagem final para sabermos que a thread concluiu seu trabalho
        System.out.println(">>>> Racer " + this.id + " TERMINOU A CORRIDA! <<<<");
    }
}