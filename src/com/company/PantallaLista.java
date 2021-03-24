package com.company;

public class PantallaLista {
    boolean mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("LISTA DE CONTACTOS");    // // titulo = "Lista de contactos"

        for (Contacto nota : Main.agendadeContactos.contactos) {
            System.out.println(nota.nombre);
        }
        System.out.println();

        Menu menu = new Menu();
        String[] opciones = {"Buscar contacto", "Eliminar contacto", "Salir"};
        String opcion = menu.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            Buscarcontacto buscarcontacto = new Buscarcontacto();
            buscarcontacto.mostrar();
        } else if ("2".equals(opcion)) {
            Eliminarcontacto eliminarcontacto = new Eliminarcontacto();
            Eliminarcontacto.mostrar();
        } else if ("3".equals(opcion)) {
            return false;
        }
//hola
        return true;

    }
}