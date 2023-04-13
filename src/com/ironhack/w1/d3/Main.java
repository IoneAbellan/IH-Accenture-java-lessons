package com.ironhack.w1.d3;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Harry poter", 100);
        Movie movie2 = new Movie("Señor de los anillos", 120);

        System.out.println("Title: " + movie1.getTitle() + ", duration: " + movie1.getDuration());
        System.out.println("Title: " + movie2.getTitle() + ", duration: " + movie2.getDuration());

        movie1.play();
    }

    /*public static Movie movieCreator(String title, int duration) {
        return new Movie(title, duration);
    }*/

}
