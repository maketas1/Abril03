package com.softtek.modelo;

public class Areas {
    //Atributos
    private int radio;
    private double areaCirculo;
    private int base;
    private int altura;
    private int areaRectangulo;

    //Constructor
    public Areas() {
    }

    public Areas(int radio, int base, int altura) {
        this.radio = radio;
        this.base = base;
        this.altura = altura;
    }

    //Metodos
    public void calculoAreaCirculo() {
        areaCirculo = Math.PI * Math.pow(radio, 2);
    }

    public void calculoAreaRectangulo() {
        areaRectangulo = base * altura;
    }

    @Override
    public String toString() {
        return  "El area del circulo de radio " + radio +
                "es: " + String.format("%.2f", areaCirculo) +
                " y el area del rectangulo de base " + base +
                " y altura " + altura +
                " es: " + areaRectangulo;
    }

    //Getter y Setter
    public String getAreaCirculo() {
        return "El area del circulo de radio " + radio +
                "es: " + String.format("%.2f", areaCirculo);
    }

    public String getAreaRectangulo() {
        return "El area del rectangulo de base " + base +
                " y altura " + altura +
                " es: " + areaRectangulo;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
