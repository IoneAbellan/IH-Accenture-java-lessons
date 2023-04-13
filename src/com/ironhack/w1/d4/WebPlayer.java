package com.ironhack.w1.d4;

public class WebPlayer extends MusicPlayer{
    public WebPlayer(double valume, int currentTrack) {
        super(valume, currentTrack);
    }

    @Override
    public void close() {
        System.out.println(("Closing web player"));
    }
}
