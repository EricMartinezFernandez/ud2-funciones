package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static double PerimetroRectangulo(double base, double altura) {

        double superficie = base * altura;
        return superficie;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduzca la base: ");
        double base = Double.parseDouble(br.readLine());

        System.out.print("Introduzca la base: ");
        double altura = Double.parseDouble(br.readLine());

        double superficie = PerimetroRectangulo(base, altura);
        System.out.print("La superficie es: ");
        System.out.println(superficie);

    }
}
