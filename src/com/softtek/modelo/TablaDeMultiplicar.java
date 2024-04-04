package com.softtek.modelo;

import java.util.Arrays;

public class TablaDeMultiplicar {
    //Atributos
    private int tabla;
    private int [] resultados = new int[11];

    //Constructor
    public TablaDeMultiplicar() {
    }

    public TablaDeMultiplicar(int tabla) {
        this.tabla = tabla;
    }

    //Metodos
    public void tablaDeMultiplicar() {
        for (int i = 0; i < resultados.length; i++){
            resultados[i] = tabla * i;
        }
    }

    @Override
    public String toString() {
        return "TablaDeMultiplicar del " + tabla + "{" +
                "resultados=" + Arrays.toString(resultados) +
                '}';
    }

    //Getter y Setter

    public int[] getResultados() {
        return resultados;
    }

    public int getTabla() {
        return tabla;
    }

    public void setTabla(int tabla) {
        this.tabla = tabla;
    }
}
