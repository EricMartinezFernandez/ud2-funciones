package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void EsPar(int numero){
        int resto;
        boolean ParImpar;
        resto = numero % 2;
        if (resto == 0){
            System.out.println("Es par");
        }
    }
    public static void EsImpar(int numero){
        int resto;
        boolean ParImpar;
        resto = numero % 2;
        if (resto != 0){
            System.out.println("Es impar");
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduzca un numero: ");
        int numero = Integer.parseInt(br.readLine());

        EsPar(numero);
        EsImpar(numero);
    }
}
