package com.softtek.presentacion;

import com.softtek.modelo.Campos;

public class Ejercicio4 {
    public static void main(String[] args) {
        Campos campos = new Campos(5);
        campos.incrementar(10);
        System.out.println(campos.getNumero());
    }
}
