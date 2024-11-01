package com.alura.restaurante.principal;

import com.alura.restaurante.modelos.Menu;

public class Principal {
    public static void main(String[] args) {
       Menu miMenu = new Menu("Spagetti boloñez",
               "Deliciosos spagettis hechos con amor",
               15000);
       miMenu.setListaIngredientes(new String[]{"Pasta","Giso con tomate","Albondigas de carne","Queso finamente cortado"});

        miMenu.muestraMenu();



    }
}
