package com.example.ProyectoIntegrador;

public class Paquete {

    private String id;
    private String tipo;
    private int peso;
    private  int valor;

    public Paquete(String id, String tipo, int peso, int valor) {
        this.id = id;
        this.tipo = tipo;
        this.peso = peso;
        this.valor = valor;
    }

    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPeso() {
        return peso;
    }

    public int getValor() {
        return valor;
    }
}
