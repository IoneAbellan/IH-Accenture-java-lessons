package com.ironhack.w1.d4;

public class AndroidPlayer extends MusicPlayer implements IPlayable, ISherable{
    public AndroidPlayer(double valume, int currentTrack) {
        super(valume, currentTrack);
    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void mute() {

    }

    @Override
    public void increaseVolume() {

    }

    @Override
    public void close() {
        System.out.println("Closing Android Player");
    }

    @Override
    public String Share() {
        return "Sharing...";
    }
}
