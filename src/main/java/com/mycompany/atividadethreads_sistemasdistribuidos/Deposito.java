package com.mycompany.atividadethreads_sistemasdistribuidos;
public class Deposito {
    private int items = 0;
    private final int capacidade = 100;
    public int getNumItens() {
        return items;
    }
    public boolean retirar() {
    if (this.items > 0) {
        this.items--;
        return true;
    }
    return false;
}
    public boolean colocar() {
        items = getNumItens() + 1;
        return true;
    }
    public static void main(String[] args) {
    Deposito dep = new Deposito();
    Produtor p = new Produtor(dep, 50);
    Consumidor c1 = new Consumidor(dep, 150);
    Consumidor c2 = new Consumidor(dep, 100);
    Consumidor c3 = new Consumidor(dep, 150);
    Consumidor c4 = new Consumidor(dep, 100);
    Consumidor c5 = new Consumidor(dep, 150);
    // Startar o produtor
    p.start();
    // Startar os consumidores.
    c1.start();
    c2.start();
    c3.start();
    c4.start();
    c5.start();

    System.out.println("Execucao do main da classe Deposito terminada");
}
}
