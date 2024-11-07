package org.example;

public class Calculadora {
    double valor, valor1, valor2;
    int valor3;
    public Calculadora() {}


    public double dividir(double valor1, double valor2) {
        try {
            return valor1 / valor2;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public double Raiz(int valor){
        try {
            return Math.sqrt(valor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
        finally {
            System.out.println("Syntax Error");
            return 0;

        }
    }
    public void Operacionraiz(double a, double b, double c){
        try{
            double discriminante= b*b-4*a*c;
            if(discriminante<0){
                System.out.println("No existen raices reales");
            }
            double raiz1=(-b+Math.sqrt(discriminante))/(2*a);
            double raiz2=(-b-Math.sqrt(discriminante))/(2*a);
            System.out.println(raiz1);
            System.out.println(raiz2);

        } catch (ArithmeticException e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
