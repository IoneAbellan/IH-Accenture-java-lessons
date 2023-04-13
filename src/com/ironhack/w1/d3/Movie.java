package com.ironhack.w1.d3;

public class Movie {
    private String title;
    private int duration;

    public Movie(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void play() {
        System.out.println("Playing " + this.title);
    }

    public static void getAlert() {  //Static para que no se necesite crear un objecto para acceder este metodo
        System.out.println("Its illegal to pirate this movie");
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
