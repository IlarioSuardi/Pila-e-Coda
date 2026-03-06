package com.example.listadinamica;

public class MiaPila {
    private Lista lista;

    public MiaPila() {
        lista = new Lista();
    }

    public void push(String valore) {
        Nodo nuovo = new Nodo(valore);
        nuovo.next = lista.head;
        lista.head = nuovo;
    }

    public String pop() {
        if (lista.head == null) {
            return null;
        }
        String valore = lista.head.value;
        lista.head = lista.head.next;
        return valore;
    }

    public String peek() {
        if (lista.head == null) {
            return null;
        }
        return lista.head.value;
    }

    public boolean isEmpty() {
        return lista.head == null;
    }

    @Override
    public String toString() {
        return lista.toString();
    }
}
