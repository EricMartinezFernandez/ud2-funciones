package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static int PerimetroRectangulo(int base, int altura) {

        int superficie = (base * 2) + (altura * 2);
        return superficie;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduzca la base: ");
        int base = Integer.parseInt(br.readLine());

        System.out.print("Introduzca la base: ");
        int altura = Integer.parseInt(br.readLine());

        int superficie = PerimetroRectangulo(base, altura);
        System.out.print("La superficie es: ");
        System.out.println(superficie);

    }
}
