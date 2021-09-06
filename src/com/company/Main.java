package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Terning terning = new Terning();
        Scanner tif = new Scanner(System.in);
        int sum = 0;
        System.out.println("vælg hvor mange gange du vil kaste terningen:\n");
        int antalKast = tif.nextInt();

        for (int i = 0; i < antalKast ; i++) {
            terning.terningKast();
            sum += terning.getNuvaerendeVaerdi();
        }
        System.out.println("Summen af alle dine kast er:\n" + sum);
    }
}
