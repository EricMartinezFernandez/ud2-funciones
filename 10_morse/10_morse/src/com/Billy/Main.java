package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void morse(String frase) {

        int numerocaracteres = frase.length();

        for (int vueltas = 0; vueltas < numerocaracteres; vueltas++) {
            char letra = frase.charAt(vueltas);

            switch (letra) {
                case 'a':
                    System.out.print("*- ");
                    break;
                case 'b':
                    System.out.print("-** ");
                    break;
                case 'c':
                    System.out.print("-*-* ");
                    break;
                case 'd':
                    System.out.print("-** ");
                    break;
                case 'e':
                    System.out.print("* ");
                    break;
                case 'f':
                    System.out.print("**-* ");
                    break;
                case 'g':
                    System.out.print("--* ");
                    break;
                case 'h':
                    System.out.print("**** ");
                    break;
                case 'i':
                    System.out.print("** ");
                    break;
                case 'j':
                    System.out.print("*--- ");
                    break;
                case 'k':
                    System.out.print("-*- ");
                    break;
                case 'l':
                    System.out.print("*-** ");
                    break;
                case 'm':
                    System.out.print("-- ");
                    break;
                case 'n':
                    System.out.print("-* ");
                    break;
                case 'o':
                    System.out.print("--- ");
                    break;
                case 'p':
                    System.out.print("*--* ");
                    break;
                case 'q':
                    System.out.print("--*- ");
                    break;
                case 'r':
                    System.out.print("*-* ");
                    break;
                case 's':
                    System.out.print("*** ");
                    break;
                case 't':
                    System.out.print("- ");
                    break;
                case 'u':
                    System.out.print("**- ");
                    break;
                case 'v':
                    System.out.print("***- ");
                    break;
                case 'w':
                    System.out.print("*-- ");
                    break;
                case 'x':
                    System.out.print("-**- ");
                    break;
                case 'y':
                    System.out.print("-*-- ");
                    break;
                case 'z':
                    System.out.print("--** ");
                    break;
                case '1':
                    System.out.print("*---- ");
                    break;
                case '2':
                    System.out.print("**--- ");
                    break;
                case '3':
                    System.out.print("***-- ");
                    break;
                case '4':
                    System.out.print("****- ");
                    break;
                case '5':
                    System.out.print("***** ");
                    break;
                case '6':
                    System.out.print("-**** ");
                    break;
                case '7':
                    System.out.print("--*** ");
                    break;
                case '8':
                    System.out.print("---** ");
                    break;
                case '9':
                    System.out.print("----* ");
                    break;
                case '0':
                    System.out.print("----- ");
                    break;
                case ' ':
                    System.out.print("|| ");
                    break;

            }

        }
        System.out.println("\n" + "--------------");
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String frase;

        do {
            System.out.print("Escribe: ");
            frase = br.readLine();

            if (!frase.equalsIgnoreCase("STOP")) {
                morse(frase);
            } else {
                System.out.println("Fin de la aplicación");
            }
        } while (!frase.equalsIgnoreCase("STOP"));
    }
}
