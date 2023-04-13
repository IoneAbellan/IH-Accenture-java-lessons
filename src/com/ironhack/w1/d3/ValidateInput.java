package com.ironhack.w1.d3;

import java.util.Scanner;

public class ValidateInput {
    public static void main(String[] args) {

        System.out.println("Please enter your age: ");
        ValidateInput demo = new ValidateInput();
        demo.validateNumber();

    }

    public void validateNumber(){
        Scanner scanner = new Scanner(System.in);

        int number;
        do{
            while (!scanner.hasNextInt()){
                String age = scanner.next();

                System.out.println(age + " is not a valid number");
            }
            System.out.println("You can't have a negative age");
            number = scanner.nextInt();

        } while (number < 0);

        System.out.println("Your age is: " + number);
    }
}
