package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static boolean calcularCambio(double dinero, String moneda) {

        double conversion = 0;
        boolean bucle;

        switch (moneda) {

            case "usd":
                conversion = dinero * 1.160245;
                System.out.println(dinero + " eruos son " + conversion + " Dolares");
                bucle = true;
                break;

            case "gbp":
                conversion = dinero * 0.89;
                System.out.println(dinero + " eruos son " + conversion + " Libras esterlinas");
                bucle = true;
                break;

            case "cny":
                conversion = dinero * 7.70;
                System.out.println(dinero + " eruos son " + conversion + " Yuanes chinos");
                bucle = true;
                break;

            case "jpy":
                conversion = dinero * 132.03;
                System.out.println(dinero + " eruos son " + conversion + " Yenes");
                bucle = true;
                break;

            default:
                System.out.println("Tipo de moneda no válida");
                System.out.println("Vuelva a introducir los datos");
                System.out.println("------------------------");
                bucle = false;
                break;
        }
        return bucle;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean bucle = false;

        do {

            System.out.print("Introduzca la cantidad de euros: ");
            double dinero = Double.parseDouble(br.readLine());

            System.out.print("Introduzca la moneda a convertir (USD, GBP, CNY, JPY): ");
            String moneda = br.readLine();

            bucle = calcularCambio(dinero, moneda);

        } while (bucle == false);



    }
}
