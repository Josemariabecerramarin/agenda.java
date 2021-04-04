package com.company;

public class AñadirContacto {
    void mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("AÑADIR CONTACTO");     // titulo = "AÑADIR CONTACTO"

        Contacto contacto = new Contacto();
        CampodeTexto campodeTexto = new CampodeTexto();

        contacto.nombre = campodeTexto.pedir("Nombre", true);

        contacto.apellido = campodeTexto.pedir("Apellido (Opcional)", false);

        contacto.telefono = campodeTexto.pedir("Telefono", true);

        contacto.otrotelefono = campodeTexto.pedir("Telefono trabajo (Opcional)", false);

        contacto.email = campodeTexto.pedir("Email (Opcional)", false);

        contacto.direccion = campodeTexto.pedir("Direccion (Opcional)", false);

        Main.agendadeContactos.contactos.add(contacto);
        Mensaje mensaje = new Mensaje();
        mensaje.mostrarInfo("Contacto Guardado!");
    }
}
