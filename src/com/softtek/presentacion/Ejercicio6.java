package com.softtek.presentacion;

import com.softtek.modelo.Alumnos;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la cantidad de parciales realizados: ");
        int cantidad = scanner.nextInt();

        Alumnos alumnos = new Alumnos(nombre, cantidad);

        double [] parciales = new double[cantidad];
        if (cantidad <= 0) {
            System.out.print("No se han realizado parciales");
        } else if (cantidad == 1) {
            System.out.print("Ingrese la nota obtenida en el parcial: ");
            parciales[0] = scanner.nextDouble();
            alumnos.setParciales(parciales);
            alumnos.calcularMedia();
            System.out.println(alumnos.toString());
        } else if (cantidad > 1) {
            for (int i = 0; i < cantidad; i++) {
                System.out.print("Ingrese la nota obtenida en el parcial " + (i + 1) + ": ");
                parciales[i] = scanner.nextDouble();
            }
            alumnos.setParciales(parciales);
            alumnos.calcularMedia();
            System.out.println(alumnos.toString());
        }
    }
}
