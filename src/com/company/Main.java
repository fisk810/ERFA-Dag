package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner tif = new Scanner(System.in);
        int rnumber = 0;
        System.out.println("Skriv x for at rulle en terning\n");
        while(true) {
            String next = tif.nextLine();
            if (next.equals("x")) {

                rnumber =(int)(Math.ceil(Math.random() * 6));
                System.out.print(rnumber + "\n");
            }
            if (rnumber == 6){
                System.out.print("Fedt, du slog en 6'er");
            }
            rnumber = 0;
        }

        //for(int e = 0, e < 11; 1++);


    }
}
