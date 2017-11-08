package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static double Longitud(double numero) {
        double resultado = 0;
        resultado = 2 * 3.14159265359 * numero;
        return resultado;
    }

    public static double area(double numero) {
        double resultado = 0;
        resultado = 3.14159265359 * (numero * numero);
        return resultado;
    }

    public static double volumen(double numero) {
        double resultado = 0;
        resultado = (4 / 3) * 3.14159265359 * (numero * numero * numero);
        return resultado;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char operacion;
        double numero = 0, resultado = 0;
        boolean bucle = true;

        do {
            System.out.print("Elija un opción: " + "\n" + "a) Longitud de la circunferencia" + "\n" + "b) Área del círculo" + "\n" + "c) Volumen de la esfera" + "\n" + "d) Salir" + "\n" + "Opcion: ");
            operacion = br.readLine().charAt(0);

            if (operacion == 'd') {
                System.out.println("Fin del programa");
            } else {
                System.out.print("Introduzca un radio: ");
                numero = Double.parseDouble(br.readLine());
            }

            switch (operacion) {
                case 'a':
                    System.out.printf("A elegido Longitud de una circunferencia");
                    System.out.print("El resultado es: ");
                    resultado = Longitud(numero);
                    System.out.println(resultado);
                    System.out.println("-----------------------");
                    break;

                case 'b':
                    System.out.println("A elegido Área de un círculo");
                    System.out.print("El resultado es: ");
                    resultado = area(numero);
                    System.out.println(resultado);
                    System.out.println("-----------------------");
                    break;

                case 'c':
                    System.out.println("A elegido Volumen de una esfera");
                    System.out.print("El resultado es: ");
                    resultado = volumen(numero);
                    System.out.println(resultado);
                    System.out.println("-----------------------");
                    break;

                case 'd':
                    bucle = false;
                    break;

                default:
                    bucle = false;
                    System.out.println("El caracter introducido no es válido");
                    System.out.println("-----------------------");

            }
        } while (bucle == true);
    }
}
