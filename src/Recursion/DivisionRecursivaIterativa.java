package Recursion;

/*Programa 1: División con Restas (Recursión e Iteración)
Desarrolla un programa que realice la división de dos números enteros utilizando
tanto el enfoque recursivo como el iterativo con restas sucesivas.
Implementa ambos enfoques en la misma clase, utilizando la sobrecarga de métodos para diferenciarlos.
Luego, realiza pruebas utilizando distintos pares de números.*/

import java.util.Scanner;

public class DivisionRecursivaIterativa {

        static Scanner entrada = new Scanner(System.in);

        //método division recursiva
        public static int division(int dividendo, int divisor) {
            if (dividendo < divisor) {
                return 0;
            } else {
                return 1 + division(dividendo - divisor, divisor);
            }
        }

        //método division iterativa
        public static int division(int dividendo, int divisor,int cociente) { //el parametro cociente es para inicializarlo.

            while (dividendo >= divisor) {
                dividendo -= divisor;
                cociente++;
            }

            return cociente;
        }

        public static void main(String[] args) {
            int divisor;
            int dividendo;
            System.out.print("Ingrese valor del dividendo: ");
            dividendo = entrada.nextInt();
            do {
                System.out.println("Ingrese valor del divisor");
                divisor = entrada.nextInt();
            }while(divisor <= 0);

            System.out.println("División recursiva: " + division(dividendo, divisor));
            System.out.println("División iterativa: " + division(dividendo, divisor,0));
        }
    }




