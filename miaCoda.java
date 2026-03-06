package com.example.listadinamica;

public class miaCoda {
    private Lista lista;

    public miaCoda() {
        lista = new Lista();
    }

    public void enqueue(String valore) {
        lista.aggiungi(valore);  // aggiunta in coda per FIFO
    }

    public String dequeue() {
        if (lista.head == null) return null;
        String valore = lista.head.value;
        lista.head = lista.head.next;
        return valore;
    }

    public boolean isEmpty() {
        return lista.head == null;
    }

    @Override
    public String toString() {
        return lista.toString();
    }
}