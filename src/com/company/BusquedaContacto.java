package com.company;

public class BusquedaContacto {
    String buscar(String busqueda) {
        return buscar(busqueda, false);
    }

    String buscar(String busqueda, boolean obligatorio) {
        System.out.println("busqueda");
        if (!obligatorio) {
            return Main.scanner.nextLine();
        } else {
            while (true) {
                String contacto = Main.scanner.nextLine();

                if (!contacto.isEmpty()) {
                    return contacto;
                } else {
                    Mensaje mensaje = new Mensaje();
                    mensaje.mostrarError("Introduce un nombre");
                }
            }
        }
    }
}