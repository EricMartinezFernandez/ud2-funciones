package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static boolean EsPar(int numero) {
        int resto;
        boolean par = true;
        resto = numero % 2;
        if (resto == 0) {
            par = true;
        }
        return par;
    }

    public static boolean EsImpar(int numero) {
        int resto;
        boolean impar = true;
        resto = numero % 2;
        if (resto != 0) {
            impar = false;
        }
        return impar;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean resultado = true;
        System.out.print("Introduzca un numero: ");
        int numero = Integer.parseInt(br.readLine());
        resultado = EsPar(numero);
        resultado = EsImpar(numero);

        if (resultado == true) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }
}
