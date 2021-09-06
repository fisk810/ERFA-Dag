package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner tif = new Scanner(System.in);
        int rnumber = 0;
        int sum = 0;
        System.out.println("Skriv antal gange du vil rulle en terning\n");
        int numberOfRolls = tif.nextInt();
        for (int i = 0; i < numberOfRolls ; i++) {
            System.out.println("---------------------------\n");
            System.out.println((i+1)+". gang du kaster terningen slår du:\n" );
            rnumber =(int)(Math.ceil(Math.random() * 6));
            sum += rnumber;
            System.out.print(rnumber + "\n");
            System.out.println("Summen af dine terningekast er:" + sum);
            if (rnumber == 6){
                System.out.print("Fedt, du slog en 6'er\n");
            }


        }


    }
}
