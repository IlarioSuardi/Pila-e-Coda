package com.example.listadinamica;

public class miaPila {
    private Nodo top;

    public miaPila() {
        top = null;
    }

    public void push(Multa multa) {
        Nodo nuovo = new Nodo(multa);
        nuovo.next = top;
        top = nuovo;
    }

    public Multa pop() {
        if (top == null) return null;
        Multa valore = top.value;
        top = top.next;
        return valore;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
