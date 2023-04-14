package Clase11;

import java.io.*;
import java.util.Scanner;

public class LeerArchivo{

    public void archivo(String archivo) throws IOException{
        try (Scanner fileScanner = new Scanner(new FileReader(archivo))) {
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        }
    }


}
