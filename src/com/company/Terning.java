package com.company;

import java.util.ArrayList;
import java.util.List;


public class Terning {
    private int sideAntal = 0;
    public List<Integer> sideVaerdier= new ArrayList<>();
    private int nuvaerendeVaerdi = 0;
    private int valgtSide = 0;

    //funktion til at lave sider på terningen
    public void givSider(int antalSider){
        for (int i = 0; i <antalSider ; i++) {
            sideVaerdier.add((int) Math.pow(2.0,i));
        }
        sideAntal = sideVaerdier.size();
    }



    public int getNuvaerendeVaerdi() {
        return nuvaerendeVaerdi;
    }

    public void terningKast(){
            System.out.println("---------------------------");
            System.out.println("du slog:");
            valgtSide = ((int) (Math.ceil(Math.random() * sideAntal)) -1);
            nuvaerendeVaerdi = sideVaerdier.get(valgtSide);
            System.out.print(nuvaerendeVaerdi + "\n");

            if (nuvaerendeVaerdi == 6) {
                System.out.print("Fedt, du slog en 6'er\n");
            }


    }
}
