package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calcolatrice {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        System.out.println("Scegli se fare addizione o sottrazione? 1 o 0");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String scelta;
        try {
            scelta = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        switch (scelta){
            case "1":
                System.out.println("Immetti i due numeri:");

                try {
                    numero1 = Integer.parseInt(reader.readLine());
                    numero2 = Integer.parseInt(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(addizione(numero1, numero2));
                break;
            case "2":
                System.out.println("Immetti i due numeri:");
                try {
                    numero1 = Integer.parseInt(reader.readLine());
                    numero2 = Integer.parseInt(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(sottrazione(numero1, numero2));
                break;

        }
        System.out.println("Programma terminato");

    }

    public static int addizione(int a, int b){
        return a + b;
    }
    public static int sottrazione(int a, int b) {
        return a-b;
    }
}