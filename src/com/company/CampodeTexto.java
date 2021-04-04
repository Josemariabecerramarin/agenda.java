package com.company;

public class CampodeTexto {
    String pedir(String pregunta) {
        return pedir(pregunta, false);
    }

    String pedir(String pregunta, boolean obligatorio) {
        System.out.println("\033[36m" + pregunta + ":\033[0m");
        if (!obligatorio) {
            return Main.scanner.nextLine();
        } else {
            while (true) {
                String contacto = Main.scanner.nextLine();

                if (!contacto.isEmpty()) {
                    return contacto;
                } else {
                    Mensaje mensaje = new Mensaje();
                    mensaje.mostrarWarn("Introduce el valor");
                }
            }
        }
    }
}