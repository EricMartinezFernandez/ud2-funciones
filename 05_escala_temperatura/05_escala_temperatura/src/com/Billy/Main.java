package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static double convertirTemperatura(boolean escala, double temperatura) {

        double resultado = 0;

        if (escala == true) {
            resultado = temperatura * 255.928;
        } else {
            resultado = temperatura * 33.8;
        }

        return resultado;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean escala;

        System.out.print("CONVERSOR DE GRADOS" + "\n" + " -----------------" + "\n" + "1. Convertir a Fahrenheit" + "\n" + "2. Convertir a Kelvin" + "\n" + "3. Salir" + "\n" + "Escribe: ");
        int respuesta = Integer.parseInt(br.readLine());


        if (respuesta == 3) {
            System.out.println(" -----------------");
            System.out.println("Fin de la aplicación.");
        } else {

            System.out.print("Introduzca una temperatura: ");
            double temperatura = Double.parseDouble(br.readLine());

            if (respuesta == 1) {
                escala = false;
                double resultado = convertirTemperatura(escala, temperatura);
                System.out.println(" -----------------");
                System.out.println("El resultado es: " + resultado + " ºF");
            } else if (respuesta == 2) {
                escala = true;
                double resultado = convertirTemperatura(escala, temperatura);
                System.out.println(" -----------------");
                System.out.println("El resultado es: " + resultado + " ºK");
            }
        }

    }
}
