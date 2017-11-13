package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static double convertirTemperatura(double centigrados) {
        double respuesta = (centigrados * 1.8) + 32;
        return respuesta;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduzca una temperatura en Grados centígrados: ");
        double centigrados = Double.parseDouble(br.readLine());

        double respuesta = convertirTemperatura(centigrados);

        System.out.print("La respuesta es:  " + respuesta + " ºF");
    }
}
