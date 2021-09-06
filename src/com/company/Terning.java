package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class Terning {
    private final int ANTALSIDER = 5;
    List<Integer> sideVaerdier= Arrays.asList(7,9,13,18,21);
    private int nuvaerendeVaerdi = 0;
    private int valgtSide = 0;


    public int getNuvaerendeVaerdi() {
        return nuvaerendeVaerdi;
    }

    public void terningKast(){
            System.out.println("---------------------------\n");
            System.out.println("du slog:\n");
            valgtSide = ((int) (Math.ceil(Math.random() * ANTALSIDER)) -1);
            nuvaerendeVaerdi = sideVaerdier.get(valgtSide);
            System.out.print(nuvaerendeVaerdi + "\n");

            if (nuvaerendeVaerdi == 6) {
                System.out.print("Fedt, du slog en 6'er\n");
            }


    }
}
