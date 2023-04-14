package Clase11;

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class EscribirArchivo {
    public void archivo(String archivo, String nombre) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriba su mensaje: ");
        String mensaje = scanner.nextLine();
        try (PrintWriter writer = new PrintWriter(new FileWriter(archivo, true))) {
            writer.println(String.format("%s (%s): %s", nombre, LocalDate.now(), mensaje));
            System.out.println("El mensaje se guardo con éxito.");
        }

    }

}
