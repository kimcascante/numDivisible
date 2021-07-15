package Semana3;

/**
 * Nombre del programa: 
 * Descripcion: Haga un programa que reciba dos números e imprima si el primer número es divisible
    entre el segundo o no.
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ejp2w3 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{ 
        int numeroUno;
        int numeroDos;
        int divide;
        String divisible;

        escribir.println("Digite el primer numero:");
        numeroUno = Integer.parseInt(leer.readLine());

        escribir.println("Digite el segundo numero");
        numeroDos = Integer.parseInt(leer.readLine());

        divide = numeroUno % numeroDos;

        if (divide == 0){
            divisible = "El numero " +numeroUno+ " si es divisible entre " +numeroDos;
        } else {
            divisible = "El numero " +numeroUno+ " no es divisible entre " +numeroDos;
        }
        
        escribir.println(divisible);
    }
}