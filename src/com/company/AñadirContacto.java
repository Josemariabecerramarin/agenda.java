package com.company;

public class AñadirContacto {
    void mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("AÑADIR CONTACTO");     // titulo = "AÑADIR CONTACTO"

        Contacto contacto = new Contacto();

        System.out.println("Nombre:");
        contacto.nombre = Main.scanner.nextLine();

        System.out.println("Apellido:");
        contacto.apellido = Main.scanner.nextLine();

        System.out.println("Telefono:");
        contacto.telefono = Main.scanner.nextLine();

        System.out.println("Email:");
        contacto.email = Main.scanner.nextLine();

        Main.agendadeContactos.contactos.add(contacto);
    }
}
