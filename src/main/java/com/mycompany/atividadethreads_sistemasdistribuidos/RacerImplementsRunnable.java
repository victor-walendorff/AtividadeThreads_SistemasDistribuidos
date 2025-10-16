package com.mycompany.atividadethreads_sistemasdistribuidos;

public class RacerImplementsRunnable implements Runnable {

    private int id;

    public RacerImplementsRunnable(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Racer " + id + " - imprimindo (implements Runnable)");
        }
    }
}