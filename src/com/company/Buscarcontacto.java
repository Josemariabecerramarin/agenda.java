package com.company;


public class Buscarcontacto {
    boolean mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("BUSCAR CONTACTO");    // // titulo = "Buscar contacto"

        CampodeTexto campodeTexto = new CampodeTexto();
        System.out.println("Escribe el nombre");
        String busqueda = Main.scanner.nextLine();
        boolean encontrado = false;
        Contacto contactoEncontrado = null;
        for (Contacto contacto : Main.agendadeContactos.contactos){
            if (contacto.nombre.equals(busqueda)){
                System.out.println("Nombre: " + contacto.nombre);
                if (contacto.apellido == null || contacto.apellido.equals("")){
                } else{
                    System.out.println("Apellido: " + contacto.apellido);
                }
                System.out.println("Telefono: " + contacto.telefono);
                if (contacto.otrotelefono == null || contacto.otrotelefono.equals("")){
                } else{
                    System.out.println("Telefono trabajo: " + contacto.otrotelefono);
                }
                if (contacto.email == null || contacto.email.equals("")){
                }else {

                    System.out.println("Email: " + contacto.email);
                }
                if (contacto.direccion == null || contacto.direccion.equals("")){
                } else{
                    System.out.println("Direccion: " + contacto.direccion);
                }
                encontrado = true;
                contactoEncontrado = contacto;
                System.out.println("");
            }
        }
        if (!encontrado) {
            Mensaje mensaje = new Mensaje();
            mensaje.mostrarError("¡Contacto no encontrado!");
        } else {
            Menu menu = new Menu();
            String[] opciones = {"Borrar", "Salir"};
            String opcion = menu.elegirOpcion(opciones);

             if ("1".equals(opcion)) {
                //Borrar contacto
                Main.agendadeContactos.contactos.remove(contactoEncontrado);
                Mensaje mensaje = new Mensaje();
                mensaje.mostrarInfo("Contacto eliminado!");
            } else if ("2".equals(opcion)) {
                //Salir
                return false;
            }
        }
        return true;
    }
}