package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner tif = new Scanner(System.in);
        int rnumber = 0;
        System.out.println("Skriv antal gange du vil rulle en terning\n");
        int numberOfRolls = tif.nextInt();
        for (int i = 0; i < numberOfRolls ; i++) {
            rnumber =(int)(Math.ceil(Math.random() * 6));
            System.out.print(rnumber + "\n");
            if (rnumber == 6){
                System.out.print("Fedt, du slog en 6'er");
            }
            rnumber = 0;

        }


    }
}
