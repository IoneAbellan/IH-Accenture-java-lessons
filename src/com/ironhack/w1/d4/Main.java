package com.ironhack.w1.d4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new WebPlayer(0.5, 1);
        WebPlayer webPlayer = new WebPlayer(0.3, 2);


        //BIG DECIMAL
        System.out.println(1.2 - 1.0);
        BigDecimal bd1 = new BigDecimal("8.95030204");
        BigDecimal bd2 = new BigDecimal("12.54759378495");

        System.out.println(bd1.subtract(bd2));
        System.out.println(bd1.divide(bd2, RoundingMode.HALF_EVEN));
        System.out.println(bd1.setScale(2, RoundingMode.HALF_EVEN));
        System.out.println(bd1.compareTo(bd2)); //si el primero es mayor dara 1, si lo dos son iguales da 0 y si el seguno es mayor da -1


    }
}
