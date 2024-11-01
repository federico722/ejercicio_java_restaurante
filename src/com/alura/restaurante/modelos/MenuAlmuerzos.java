package com.alura.restaurante.modelos;

public class MenuAlmuerzos extends Menu{
    private String Entrantes;
    private String PlatoPrincipal;
    private String Acompañamientos;
    private String Bebidas;

    public String getEntrantes() {
        return Entrantes;
    }

    public void setEntrantes(String entrantes) {
        Entrantes = entrantes;
    }

    public String getPlatoPrincipal() {
        return PlatoPrincipal;
    }

    public void setPlatoPrincipal(String platoPrincipal) {
        PlatoPrincipal = platoPrincipal;
    }

    public String getAcompañamientos() {
        return Acompañamientos;
    }

    public void setAcompañamientos(String acompañamientos) {
        Acompañamientos = acompañamientos;
    }

    public String getBebidas() {
        return Bebidas;
    }

    public void setBebidas(String bebidas) {
        Bebidas = bebidas;
    }

    public MenuAlmuerzos(String nombreMenu, String descripcion, double precio) {
        super(nombreMenu, descripcion, precio);
    }


}
