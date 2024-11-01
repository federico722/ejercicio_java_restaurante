package com.alura.restaurante.modelos;

import java.util.Arrays;

public class Menu {
    private String nombreMenu;
    private String descripcion;
    private String[] listaIngredientes;
    private double precio;
    private String mensaje;


    public Menu(String nombreMenu, String descripcion, double precio) {
        this.nombreMenu = nombreMenu;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String[] getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(String[] listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getNombreMenu() {
        return nombreMenu;
    }

    public void setNombreMenu(String nombreMenu) {
        this.nombreMenu = nombreMenu;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void muestraMenu(){
        mensaje = """
                ***********************************************************
                Bienvenido a nuestro restaurante usted ha seleccionado el
                Menu: %s
                Descripcion: %s
                lista ingredientes: %s
                Precio:$%.2f
                """.formatted(nombreMenu, descripcion, imprimirListaIngredientes(), precio);
        System.out.println(mensaje);
    }

    public String imprimirListaIngredientes (){
        return Arrays.toString(listaIngredientes);
    }
}
