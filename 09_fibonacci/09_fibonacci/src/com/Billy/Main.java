package com.Billy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void FibonacciRepetitiva() {
        int a = 1, b = 0, c = 0, controlador = 1, resto = 1;

        for (int vueltas = 0; vueltas < 10; vueltas++) {

            c = a + b;
            System.out.println(c);
            controlador++;
            resto = controlador % 2;
            if (resto == 0) {
                b = c;
            } else {
                a = c;
            }


        }
        System.out.println("FIN");
    }

    public static void FibonacciRecursivo(int controlador, int a, int b, int c) {

        int resto;
        if (controlador < 10) {
            c = a + b;
            System.out.println(c);
            controlador++;
            resto = controlador % 2;

            if (resto == 0) {
                a = c;
            } else {
                b = c;
            }

            FibonacciRecursivo(controlador, a, b, c);

        } else {

            System.out.println("FIN");

        }


    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 1, b = 0, c = 0, controlador = 0;

        System.out.println("-----------------" + "\n" + "VERSION REPETITIVA" + "\n" + "-----------------");
        FibonacciRepetitiva();
        System.out.println("-----------------" + "\n" + "VERSION RECURSIVA" + "\n" + "-----------------");
        FibonacciRecursivo(controlador, a, b, c);


    }
}
