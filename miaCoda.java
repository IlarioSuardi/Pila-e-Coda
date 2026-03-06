package com.example.listadinamica;

public class miaCoda {
    private Nodo head;
    private Nodo tail;

    public miaCoda() {
        head = null;
        tail = null;
    }

    public void enqueue(Multa multa) {
        Nodo nuovo = new Nodo(multa);
        if (tail == null) {
            head = nuovo;
            tail = nuovo;
        } else {
            tail.next = nuovo;
            tail = nuovo;
        }
    }

    public Multa dequeue() {
        if (head == null) return null;
        Multa valore = head.value;
        head = head.next;
        if (head == null) tail = null;
        return valore;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
