package Recursion;

import java.util.Scanner;

/*
Programa 3: Factorial con Sobrecarga (Recursión e Iteración)
Crea un programa que calcule el factorial de un número utilizando dos métodos diferentes:
uno utilizando recursión y otro utilizando iteración.
Estos métodos deben estar en una clase distinta. Emplea la sobrecarga de métodos para diferenciar entre las dos implementaciones.
Realiza pruebas del programa con distintos números enteros.
*/
public class Factoriales {

    public static int facto (int numero){

        //factorial con función recursiva.
        if(numero == 1 || numero == 0) return 1;
        else return numero * facto(numero - 1);
    }

    public static int facto(int numero, int i){

        //Factorial de forma iterativa.
        //El parámetro "i" se utiliza para controlar el fin del ciclo. Definimos a partir de que valor comienza a multiplicar
        int  fact = 1;
        while( i < numero){
            i++;
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        System.out.println("Ingrese un número para conocer su factorial:");
        int n = enter.nextInt();

        System.out.println("Factorial recursivo: "+facto(n));
        System.out.println("Factorial iterativo: "+facto(n,1));

    }
}
