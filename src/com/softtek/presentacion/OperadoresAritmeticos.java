package com.softtek.presentacion;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
//        ejemplo1();
        ejercicioEjemplo1();
        ejemplo2();
    }

    public static void ejemplo1() {
        int numero = 0;
        numero = numero +1;
        System.out.println(numero);
        numero += 1;
        System.out.println(numero);
        numero++;
        System.out.println(numero);

        //Pre-incremento
        int resultado;
        numero = 6;
        resultado = ++numero;
        System.out.println("Rsultado con pre-incremento -> " + resultado);

        numero = 6;
        resultado = numero++;
        System.out.println("Rsultado con pre-incremento -> " + resultado);
        System.out.println(numero);
    }

    public static void ejercicioEjemplo1() {
        int x = 5;
        int y = ++x;
        int z = y--;

        System.out.println("x=" + x + ", y=" + y + ", z=" + z);
    }

    public static void ejemplo2() {
        //Declarar variable y decrementar
        int numero2 = 100;
        numero2 = numero2 -5;
        System.out.println("numero2 -> " + numero2);
        numero2 -= 5;
        numero2 = numero2 - 5;
        System.out.println("numero2 -> " + numero2);
        numero2--;
        System.out.println("numero2 -> " + numero2);

        //Multiplicar
        int numero3 = 7;
        numero3 = numero3 * 3;
        System.out.println("numero3 -> " + numero3);
        numero3 *= 2;
        System.out.println("numero3 -> " + numero3);

        //Division - dividir entre 10 y luego entre 5
        int numero4 = 100;
        numero4 = numero4 / 10;
        System.out.println("numero4 -> " + numero4);
        numero4 /= 5;
        System.out.println("numero4 -> " + numero4);
    }
}
