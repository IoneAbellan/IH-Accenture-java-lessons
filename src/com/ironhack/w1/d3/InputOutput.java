package com.ironhack.w1.d3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) throws IOException {
        //INPUT OUTPUT
        //System.out.println("Prueba de salida normal por consola");
        //System.err.println("Prueba de salida de error por consola");

        Scanner scanner = new Scanner(System.in);

        String name;
        do {
            System.out.println("Please write your name: ");
            name = scanner.nextLine();
        } while(name.length() < 3);

        System.out.println("Your name is: " + name);

        System.out.println("Please write your name");
        int age = scanner.nextInt();
        System.out.println("Your age is: " + age);


        scanner.close(); //buena practica para liberar recursos del pc


        //FILE HANDLING
        String filePath = "src/com/ironhack/w1/d3/fichero.txt";
        File file = new File(filePath);
        if (file.createNewFile()){ //esto devuelve true o false si crea el archivo
            System.out.println("El archivo se ha creado");
        } else {
            System.out.println("El archivo ya esiste");
        }

        FileWriter fileWriter = new FileWriter(filePath, false); //TRUE: la información aparecerá despues del contenido que ya hay. FALSE: Sobreescribirá lo que hay
        fileWriter.write("Esto es una line\n");
        fileWriter.write("Esto es otra linea\n");

        fileWriter.close();

        Scanner fileScanner = new Scanner(file);
        String str = "";
        while(fileScanner.hasNextLine()){
            str += fileScanner.nextLine() + "\nm";
            System.out.println(str);
        }
        scanner.close();
    }
}
