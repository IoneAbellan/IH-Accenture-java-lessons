package com.ironhack.w1.d3;

public class HorrorMovie extends Movie{

    private boolean isScary;

    public HorrorMovie(String title, int duration, boolean isScary) {
        super(title, duration);
        this.isScary = isScary;
    }

    public boolean isScary() {
        return isScary;
    }

    public void setScary(boolean scary) {
        isScary = scary;
    }
}
