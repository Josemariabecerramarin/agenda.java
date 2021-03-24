package com.company;


public class Buscarcontacto {
    void mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("BUSCAR CONTACTO");    // // titulo = "Buscar contacto"

        BusquedaContacto busquedaContacto = new BusquedaContacto();
        System.out.println("Escribe el nombre");
        String busqueda = Main.scanner.nextLine();
        boolean encontrado = false;
        Contacto contactoEncontrado = null;
        for (Contacto contacto : Main.agendadeContactos.contactos){
            if (contacto.nombre.equals(busqueda)){
                System.out.println(contacto.nombre);
                System.out.println(contacto.apellido);
                System.out.println(contacto.telefono);
                if (contacto.email == null){
                }else {
                    System.out.println(contacto.email);
                }
            }
        }

    }



}
