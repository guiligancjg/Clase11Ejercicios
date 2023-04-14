package Clase11;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ProcessBuilder prueba1 = new ProcessBuilder();

        for (int i = 0; i < 100000 ; i++) {


        EscribirArchivo escribir = new EscribirArchivo();
        LeerArchivo leer = new LeerArchivo();
        Scanner scanner = new Scanner(System.in);
        String rutaArchivoChat = "src/Clase11/mensajes.txt";


        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        while (true) {
            System.out.println("\n1. Escribir mensaje\n2. Leer mensajes\n3. Salir");
            System.out.print("Ingrese su opción: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch(option) {
                case 1:
                    escribir.archivo(rutaArchivoChat,nombre);
                    break;
                case 2:
                    leer.archivo(rutaArchivoChat);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Opción inválida.");
            }
        }


        }

    }//cierre Main
}