
package com.softtek.modelo;

public class Campos {
    //Atributos
    private int numero;

    //Constructor
    public Campos(int numero) {
        this.numero = numero;
    }

    //Metodos
    public void incrementar(int incremento) {
        this.numero += incremento;
    }

    //Getter y Setter
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}
