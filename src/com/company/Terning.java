package com.company;

public class Terning {
    private int antalSider = 6;
    private int nuvaerendeVaerdi = 0;


    public int getNuvaerendeVaerdi() {
        return nuvaerendeVaerdi;
    }

    public void terningKast(){
            System.out.println("---------------------------\n");
            System.out.println("du slog:\n");
            nuvaerendeVaerdi = (int) (Math.ceil(Math.random() * antalSider));
            System.out.print(nuvaerendeVaerdi + "\n");

            if (nuvaerendeVaerdi == 6) {
                System.out.print("Fedt, du slog en 6'er\n");
            }


    }
}
