package com.softtek.modelo;

public class Producto {
    //1. Atributos
    private int idProducto;
    private String nombre;
    private int cantidadExistencia;

    //2. Metodos
    public void compraProductos(int cantidad) {
        if (cantidad <= cantidadExistencia) {
            cantidadExistencia = cantidadExistencia + cantidad;
            //cantidadExistencia += cantidad;
        }
    }

    public void ventaProductos(int cantidad) {
        if (cantidad <= cantidadExistencia) {
            cantidadExistencia = cantidadExistencia - cantidad;
            //cantidadExistencia -= cantidad;
        }
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", cantidadExistencia=" + cantidadExistencia +
                '}';
    }

    //3. Constructores
    public Producto() {

    }

    public Producto(int idProducto, String nombre, int cantidadExistencia) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidadExistencia = cantidadExistencia;
    }

    //4. Setter y Getter

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadExistencia() {
        return cantidadExistencia;
    }

    public void setCantidadExistencia(int cantidadExistencia) {
        this.cantidadExistencia = cantidadExistencia;
    }
}
