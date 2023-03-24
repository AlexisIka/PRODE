package org.example;
//hola alexis
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {

        String archivo1 = "C:\\Users\\Iglesia Juan 316\\Desktop\\Java UTN\\resultados.csv";

        for (String linea : Files.readAllLines(Paths.get(archivo1))){
           System.out.println(linea);
       }

    }
}