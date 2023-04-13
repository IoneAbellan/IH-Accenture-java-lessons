package com.ironhack.w1.d4;

public interface IPlayable { //In an interface all methods are public and abstract

    void play();
    void pause();
    void mute();
    void increaseVolume();

    final double MAX_VOLUME = 1; // las interfaces no tienen variables pero si constantes. NO HACE FALTA PONER EL FINAL
}
