package Recursion;

import java.util.Scanner;

/*
Programa 2: Sumatoria Recursiva
Escribe un programa que calcule la sumatoria de los números enteros desde 1 hasta un número dado utilizando una función recursiva.
 Implementa esta funcionalidad en una clase separada.
 Asegúrate de probar la función con diferentes valores de entrada.
*/
public class Sumatoria {

    public static int sumarecursiva(int numero){
        //utilizamos operador ternario.
        int valor;
        return  valor = (numero == 1) ? 1 : numero + sumarecursiva(numero -1);
    }

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        System.out.println("Ingrese un numero este se sumara con todos sus anteriores:");
        int n = enter.nextInt();

        System.out.println("La suma es: "+sumarecursiva(n));
    }
}
