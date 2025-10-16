package com.mycompany.atividadethreads_sistemasdistribuidos;

import java.util.ArrayList;
import java.util.List;

public class Race {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("--- INICIANDO A CORRIDA SINCRONIZADA COM JOIN (ITEM F) ---");

        // Lista para guardar as threads dos racers ímpares para podermos dar 'join' nelas
        List<Thread> oddRacers = new ArrayList<>();

        System.out.println("--- LARGADA DOS ÍMPARES (1, 3, 5, 7, 9) ---");
        // 1. Criando e iniciando os racers ÍMPARES
        for (int i = 1; i <= 10; i += 2) {
            RacerExtendsThread racer = new RacerExtendsThread(i);
            oddRacers.add(racer); // Adiciona a thread na lista para controle
            racer.start();
        }

        System.out.println("--- Thread main esperando todos os ímpares terminarem... ---");
        // 2. Esperando os racers ímpares terminarem
        for (Thread racer : oddRacers) {
            // A thread 'main' vai pausar aqui e esperar o 'racer' atual terminar sua execução
            racer.join();
        }

        System.out.println("\n--- LARGADA DOS PARES (2, 4, 6, 8, 10) ---");
        // 3. Criando e iniciando os racers PARES
        for (int i = 2; i <= 10; i += 2) {
            RacerExtendsThread racer = new RacerExtendsThread(i);
            racer.start();
        }
    }
}