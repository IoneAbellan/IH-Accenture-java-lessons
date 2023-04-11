package com.ironhack.w1.d1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        byte myByte = 127;
        short myShort = 1000;
        int myInt = 999999999;
        double myDouble = 10.1234;
        boolean isBooleand = true;

        String myString = "Hola Ironhack!";
        String myName;
        myName = "Ione";

        System.out.println(myByte);

        myInt = myInt + 1000;
        myInt += 1000;

        int number = 10;

        System.out.println(number / 3);
        System.out.println(number % 3); //da el resto de la division

        System.out.println("Operador detrás: " + number++); //Con el operador a la derecha suma despues de utilizar la variable
        number = 10;
        System.out.println("Operador delante: " + ++number); // Con el operador a la izquierda primero suma y despues utiliza la variable

        number *= 10;
        System.out.println(number);


        //CONDICIONALES

        number = 10;
        if (number >= 1000) {
            System.out.println("Number es mayor o igual que 1000");
        } else if (number > 0 && number < 999) {
            System.out.println("Estamos en el else if");
        } else if (number > 100) {
            System.out.println("Estamos en el else if 2"); // esta condicion es inalcanzable
        } else if (number == 0) {
            System.out.println("number es igual que 0");
        } else {
            System.out.println("Number es menor que 1000");
        }

        if (number > 10 || number < -10) {
            System.out.println("number tiene mas de 2 cifras");
        }

        if (number % 2 == 0) System.out.println("number es par"); // Si solo hay una linea es mejor no poner llaves
        else System.out.println("number es impar");


        double mark = 6.5;
        boolean hasPassed = mark >=5 ? true : false; //Esto es un operador ternario, condicion + ? + si se cumple + : + si no se cumple

        myMethod();
        String info = getInfo(1);
        System.out.println("info: " + info);

        stringMethods();

        // WRAPPER para convertir las variables primitivas en classes
         Integer myInteger = 100;



    }

    public static void myMethod(){
        System.out.println("this");
        System.out.println("is");
        System.out.println("inside");
        System.out.println("myMethod");
    }

    public static String getInfo(int option){
        if(option == 1) return "My name is Ione";
        else if (option == 2) return "This is an Ironhack bootcamp";
        else return "option" + option + "provides no info";
    }


    //STRING METHODS

    public static void stringMethods(){
        String address = "C/Falsa 001";

        System.out.println(address.length());
        System.out.println(address.toUpperCase());
        System.out.println(address.toUpperCase().replace("A", "-"));

        String addess2 = "Granvia 34";

        if(addess2.equals(addess2)) System.out.println("same street");
        else System.out.println("different streets");
    }

}