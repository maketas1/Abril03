package com.softtek.presentacion;

import com.softtek.modelo.TablaDeMultiplicar;

public class Ejercicio5 {
    public static void main(String[] args) {
        TablaDeMultiplicar tablaDeMultiplicar = new TablaDeMultiplicar();
        tablaDeMultiplicar.setTabla(5);
        tablaDeMultiplicar.tablaDeMultiplicar();
        int []resultados = tablaDeMultiplicar.getResultados();
        for (int i = 0; i < resultados.length; i++) {
            System.out.println(tablaDeMultiplicar.getTabla() + " X " + i + " = " + resultados[i]);
        }
    }
}
