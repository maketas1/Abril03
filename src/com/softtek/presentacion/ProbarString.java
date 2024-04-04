package com.softtek.presentacion;

public class ProbarString {
    public static void main(String[] args) {
        String frase = "Nunca mates una mosca sobre la cabeza de un tigre.";
        a(frase);
        b(frase);
        c(frase);
        d(frase);
        e(frase);
        f(frase);
        g(frase);
    }

    public static void a(String frase) {
        System.out.println(frase.toUpperCase());
    }

    public static void b(String frase) {
        System.out.println(frase.toLowerCase());
    }

    public static void c(String frase) {
        String buscar1 = "Nunca";
        int indice1 = frase.indexOf(buscar1);
        int fin1 = indice1 + buscar1.length();
        String encontrada1 = frase.substring(indice1, fin1);
        System.out.println(encontrada1);
    }

    public static void d(String frase) {
        String buscar2 = "mosca";
        int indice2 = frase.indexOf(buscar2);
        int fin2 = indice2 + buscar2.length();
        String encontrada2 = frase.substring(indice2, fin2);
        System.out.println(encontrada2);
    }

    public static void e(String frase) {
        String buscar3 = "cabeza";
        int indice3 = frase.indexOf(buscar3);
        int fin3 = indice3 + buscar3.length();
        String encontrada3 = frase.substring(indice3, fin3);
        System.out.println(encontrada3);
    }

    public static void f(String frase) {
        System.out.println(frase.indexOf("m"));
    }

    public static void g(String frase) {
        System.out.println(frase.length());
    }
}
