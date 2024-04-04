package com.softtek.presentacion;

public class TiposPrimitivos {
    public static void main(String[] args) {
        areaDelCuadrado();
        areaDelCirculo();
        perimetroDelRectangulo();
    }

    public static void areaDelCuadrado() {
        int lado = 6;
        int area = lado * lado;
        System.out.println("El area del cuadrado es: " + area);
    }

    public static void areaDelCirculo() {
        int radio = 3;
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es: " + area);
    }

    public static void perimetroDelRectangulo() {
        int base = 4;
        int altura = 3;
        int perimetro = 2 * (base * altura);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }
}
