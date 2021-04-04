package com.company;

public class PantallaLista {
    boolean mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("LISTA DE CONTACTOS");    // // titulo = "Lista de contactos"

        for (Contacto contacto : Main.agendadeContactos.contactos) {
            System.out.println(contacto.nombre);
        }
        System.out.println();

        Menu menu = new Menu();
        String[] opciones = {"Buscar contacto", "Salir"};
        String opcion = menu.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            Buscarcontacto buscarcontacto = new Buscarcontacto();
            buscarcontacto.mostrar();
        } else if ("2".equals(opcion)) {
            return false;
        }

        return true;

    }
}