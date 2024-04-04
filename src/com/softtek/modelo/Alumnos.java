package com.softtek.modelo;

import java.util.Arrays;

public class Alumnos {
    //Atributos
    private double []parciales;
    private String nombre;
    private double media;
    private String decimales;

    //Constructor
    public Alumnos(String nombre, int cantidad) {
        this.parciales = new double[cantidad];
        this.nombre = nombre;
    }

    //Metodos
    public void calcularMedia() {
        for (double parcial : this.parciales) {
            media += parcial;
        }
        media = media / this.parciales.length;
    }

    public void formateoDecimales() {
        if (parciales.length == 1) {
            decimales = "parcial: " + String.format("%.2f", parciales[0]);
        } else {
            for (int i = 0; i < parciales.length; i++) {
                decimales += "parcial " + i + ": " + String.format("%.2f", parciales[0]) + ", ";
            }
        }
    }

//    @Override
//    public String toString() {
//        return "El alumno con " + nombre +
//                ", tine las siguentes calificaciones en los parciales: " + Arrays.toString(parciales) +
//                ", que le da una media de: " + String.format("%.2f", media);
//    }

    @Override
    public String toString() {
        formateoDecimales();
        return "El alumno con " + nombre +
                "\nObteniendo las siguentes calificaciones en el/los parciales: " + decimales +
                "\nCon una media final de: " + String.format("%.2f", media);
    }

    //Getter y Setter

    public double[] getParciales() {
        return parciales;
    }

    public void setParciales(double[] parciales) {
        this.parciales = parciales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMedia() {
        return media;
    }
}
