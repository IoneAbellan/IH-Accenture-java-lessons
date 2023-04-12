package com.ironhack.w1.d2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[]days = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
        System.out.println(days[4]);

        String[] subjectsArray = createSubjectsArray();
        System.out.println(subjectsArray[2]);
        System.out.println(subjectsArray.length);

        //FOR LOOP

        for(int i = 0; i < subjectsArray.length; i++){
            if(subjectsArray[i].equals("Lengua")) continue;
            System.out.println(subjectsArray[i]);
            //if(subjectsArray[i].equals("Historia")) break;
        }

        int[] evenNumbers = new int[51];
        int j = 0;
        for (int i = 0; i <= 100; i++){
            if(i % 2 == 0){
                evenNumbers[j] = i;
                j++;
            }
        }

        System.out.println(evenNumbers.length);
        System.out.println(Arrays.toString(evenNumbers));

        //FOR EACH LOOP

        for(int number : evenNumbers){
            System.out.println(number);
        }

        // WHILE LOOP

        int counter = 100;
        while (counter < evenNumbers.length){
            counter++;
        }
        System.out.println("while counter: " + counter);

        // DO WHILE LOOP

        counter = 100;
        do{
            counter++;
        } while (counter < evenNumbers.length);
        System.out.println("dowhile counter: " + counter);


        // MATH CLASS AND CASTING

        System.out.println(Math.sqrt(64));
        System.out.println((int)Math.pow(2,5));
        System.out.println((int)3.42);



        // ARRAYLIST

        List<String>  countries = new ArrayList<>();
        countries.add("España");
        countries.add("Portugal");
        countries.add("Francia");
        System.out.println(countries.get(0));
        countries.set(0, "Italia"); // para cambiar un indice
        System.out.println(countries.get(0));
        System.out.println(countries.size());
        countries.remove(0);
        System.out.println(countries.size());

        for(int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }

        // no se pueden hacer listas con elementos primitivos

        // ADD ELEMENTS TO ARRAY

        int [] numbers = {0, 1, 2, 3, 4};

        int[] newArray = new int[6];
        for(int i = 0; i < 5; i++) {
            newArray[i] = numbers[i];
        }
        newArray[5] = 5;

        System.out.println(Arrays.toString(newArray));

        //CHECK FOR UNDERSTANDING
        System.out.println("Check for understanding: ");
        int[] numbersArray = {19, 8, 10, 22, 7};
        loopUnderstanding1(numbersArray);
    }

    public static String[] createSubjectsArray(){
        String[] subjects = new String[5];
        subjects[0] = "Matematicas";
        subjects[1] = "Lengua";
        subjects[2] = "Historia";
        subjects[3] = "Biologia";
        subjects[4] = "Quimica";

        return subjects;
    }

    public static void loopUnderstanding1(int[] numArray){

        for(int i = 0; i < numArray.length-1; i++){
            numArray[i] = numArray[i]*numArray[i+1];
        }
        numArray[numArray.length-1] = numArray[0]* numArray[numArray.length-1];

        for(int number : numArray){
            System.out.println(number);
        }

    }
}
