package com.example.listadinamica;

public class MiaCoda {
    private Lista lista;

    public MiaCoda() {
        lista = new Lista();
    }

    public void enqueue(String valore) {
        lista.aggiungi(valore);
    }

    public String dequeue() {
        if (lista.head == null){
            return null;
        }
        String valore = lista.head.value;
        lista.head = lista.head.next;
        return valore;
    }

    public String peek() {
        if (lista.head == null){
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