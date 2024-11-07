package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Division midivision = new Division();
//
//        System.out.println("Ingrese un valor: ");
//        Double a = sc.nextDouble();
//        System.out.println("Ingrese otro valor: ");
//        Double b = sc.nextDouble();
//
//
//        Double resultado = midivision.Operacion(a, b);
//        System.out.println("\nResultado: "+ resultado);


        /*Division division = new Division();
        try {
            System.out.println(division.Operacion(10, 0));
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Resultado: "+ division.Operacion(10,0));
            System.out.println("Resultado de enteros: "+ division.Operacion(10,1));
        }*/
        Calculadora calculadora = new Calculadora();
        /* System.out.println(calculadora.Raiz(-1));*/

        System.out.println(calculadora.Operacionraiz(2,3,5));



    }
}