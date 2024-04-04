package com.softtek.presentacion;

import com.softtek.modelo.Areas;

public class Ejercicio3 {
    public static void main(String[] args) {
        Areas areas = new Areas();
        areas.setRadio(10);
        areas.calculoAreaCirculo();
        System.out.println(areas.getAreaCirculo());
        areas.setBase(6);
        areas.setAltura(5);
        areas.calculoAreaRectangulo();
        System.out.println(areas.getAreaRectangulo());
        System.out.println("De manera que el rasultado final seria el siguiente:");
        System.out.println(areas.toString());
    }
}
