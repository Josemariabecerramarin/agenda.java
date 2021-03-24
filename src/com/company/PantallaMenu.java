package com.company;

import java.util.Scanner;

public class PantallaMenu {
    boolean mostrar(){
        Titulo titulo = new Titulo();
        titulo.mostrar("AGENDA DE CONTACTOS");    // // titulo = "AGENDA DE CONTACTOS"

        Menu menu = new Menu();
        String[] opciones = {"Añadir contacto", "Listar Contactos", "Salir"};
        String opcion = menu.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            AñadirContacto añadirContacto = new AñadirContacto();
            añadirContacto.mostrar();
        } else if("2".equals(opcion)){
            PantallaLista pantallaLista = new PantallaLista();
            pantallaLista.mostrar();
        } else if("3".equals(opcion)){
            return false;
        }
        return true;
    }
}
