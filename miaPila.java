package com.example.listadinamica;

public class miaPila {
    private Lista lista;

    public miaPila() {
        lista = new Lista();
    }

    public void push(String valore) {
        Nodo nuovo = new Nodo(valore);
        nuovo.next = lista.head;  // inserimento in testa per LIFO
        lista.head = nuovo;
    }

    public String pop() {
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