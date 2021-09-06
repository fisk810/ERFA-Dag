package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Terning terning = new Terning();
        Scanner tif = new Scanner(System.in);
        int sum = 0;

        System.out.println("vælg hvor mange sider terningen skal have");
        int antalSider = tif.nextInt();
        terning.givSider(antalSider);
        System.out.println("terning har følgende sideværdier");
        System.out.println(terning.sideVaerdier);

        System.out.println("vælg hvor mange gange du vil kaste terningen:");
        int antalKast = tif.nextInt();

        for (int i = 0; i < antalKast ; i++) {
            terning.terningKast();
            sum += terning.getNuvaerendeVaerdi();
        }
        System.out.println("---------------------------\n"+"Summen af alle dine kast er:\n" + sum);
    }
}
