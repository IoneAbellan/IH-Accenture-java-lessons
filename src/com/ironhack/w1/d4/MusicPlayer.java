package com.ironhack.w1.d4;

public abstract class MusicPlayer { //No podemos instanciar una clase abstracta
    private double valume;
    private int currentTrack;

    public MusicPlayer(double valume, int currentTrack) {
        this.valume = valume;
        this.currentTrack = currentTrack;
    }

    public double getValume() {
        return valume;
    }

    public int getCurrentTrack() {
        return currentTrack;
    }

    public void setValume(double valume) {
        this.valume = valume;
    }

    public void setCurrentTrack(int currentTrack) {
        this.currentTrack = currentTrack;
    }


    public void getNextTrack(){
        this.currentTrack++;
    }
    public abstract void close();
}
