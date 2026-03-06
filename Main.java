package com.example.listadinamica;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.aggiungi("Ilario");
        lista.aggiungi("Suardi");
        lista.aggiungi("03/06/2008");

        System.out.println("Lista:");
        lista.resetIteratore();
        System.out.println("visita1: " + lista.visita());
        System.out.println("visita2: " + lista.visita());
        System.out.println("visita3: " + lista.visita());

        MiaPila pila = new MiaPila();
        pila.push("Ilario");
        pila.push("Suardi");
        pila.push("03/06/2008");

        System.out.println("\nPila:");
        System.out.println("peek: " + pila.peek());
        System.out.println("pop: " + pila.pop());
        System.out.println("pop: " + pila.pop());

        MiaCoda coda = new MiaCoda();
        coda.enqueue("Ilario");
        coda.enqueue("Suardi");
        coda.enqueue("03/06/2008");

        System.out.println("\nCoda:");
        System.out.println("peek: " + coda.peek());
        System.out.println("dequeue: " + coda.dequeue());
        System.out.println("dequeue: " + coda.dequeue());
    }
}