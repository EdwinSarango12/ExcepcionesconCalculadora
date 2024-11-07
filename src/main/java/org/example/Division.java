package org.example;
import java.lang.Math;

public class Division {
    double numerador;
    double denominador;

    public Division() {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public double getNumerador() {
        return numerador;
    }
    public void setNumerador(double numerador) {
        this.numerador = numerador;
    }
    public double getDenominador() {
        return denominador;
    }
    public void setDenominador(double denominador) {
        this.denominador = denominador;
    }

    public double Operacion(double a, double b) {
        return a / b;
    }
    public int OperacionEnteros(int a, int b) {
        return a * b;
    }
    public void OperacionRaiz(double a, double b) {
        double raiz1=Math.sqrt(a);
        double raiz2=Math.sqrt(b);
        System.out.println("Resultado de la primera raiz: "+ raiz1);
        System.out.println("Resultado de la segunda raiz: "+ raiz2);
    }


}
