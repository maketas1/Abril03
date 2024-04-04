package com.softtek.presentacion;

import com.softtek.modelo.Dado;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Dado dado = new Dado();
        Scanner scanner = new Scanner(System.in);
        String seguir;

        System.out.println(dado.resultado());

        System.out.print("Quiere seguir s/n");
        seguir = scanner.nextLine();
        while (!seguir.equals("n")){
            System.out.println(dado.tirar());

            System.out.print("Quiere seguir s/n");
            seguir = scanner.nextLine();
        }
    }
}
