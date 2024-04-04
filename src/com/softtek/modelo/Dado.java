package com.softtek.modelo;

import java.util.Random;

public class Dado {
    //Atributos
    private Random random = new Random();
    int numeroAleatorio;

    //Constructor
    public Dado() {
        numero();
    }

    //Metodos
    public void numero() {
        this.numeroAleatorio = random.nextInt(6) + 1;
    }

    public String tirar() {
        numero();
        return resultado();
    }

    public String resultado() {
        if (numeroAleatorio == 1) {
            return numero1();
        } else if (numeroAleatorio == 2) {
            return numero2();
        } else if (numeroAleatorio == 3) {
            return numero3();
        } else if (numeroAleatorio == 4) {
            return numero4();
        } else if (numeroAleatorio == 5) {
            return numero5();
        } else if (numeroAleatorio == 6) {
            return numero6();
        } else {
            return null;
        }
    }

    public String numero1() {
        return " * ";
    }

    public String numero2() {
        return " * \n * ";
    }

    public String numero3() {
        return "*  \n * \n  *";
    }

    public String numero4() {
        return "* *\n* *";
    }

    public String numero5() {
        return "* *\n * \n* *";
    }

    public String numero6() {
        return "* *\n* *\n* *";
    }

    //Getter y Setter

    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }

    public void setNumeroAleatorio(int numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
    }
}
