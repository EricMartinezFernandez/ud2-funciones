package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void VersionRepetitiva(int numero) {
        int resultado = 1;
        for (int multiplicacion = 1; multiplicacion != numero; multiplicacion++) {

            resultado = resultado * multiplicacion;
            System.out.println(resultado);

        }
    }

    public static void VersionRecursiva(int numero, int resultado, int tope) {


        if (numero == tope) {
            System.out.println("-----------------------");
            System.out.println("FIN");
        } else {
            resultado = resultado * numero;
            System.out.println(resultado);
            numero++;
            VersionRecursiva(numero, resultado, tope);
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numero = 1, resultado = 1, tope;

        System.out.print("Introduzca un numero: ");
        tope = Integer.parseInt(br.readLine());

        System.out.println();
        System.out.print("Versión repetitiva: ");
        VersionRepetitiva(tope);
        System.out.println("\n" + "---------------------" + "\n");
        System.out.print("Versión recursiva: ");
        VersionRecursiva(numero, resultado, tope);


    }
}
