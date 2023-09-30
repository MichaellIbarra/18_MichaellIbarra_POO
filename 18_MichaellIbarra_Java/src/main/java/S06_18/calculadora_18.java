/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S06_18;

import java.util.Scanner;

/**
 *
 * @author Matichelo
 */
public class calculadora_18 {
    
    // Constructores con valores predeterminados
    public calculadora_18() {
    }

    public calculadora_18(double num1, double num2) {
        System.out.println("Suma: " + sumar(num1, num2));
        System.out.println("Resta: " + restar(num1, num2));
        System.out.println("Multiplicación: " + multiplicar(num1, num2));
        double resultadoDivision = dividir(num1, num2);
        if (!Double.isNaN(resultadoDivision)) {
            System.out.println("División: " + resultadoDivision);
        }
    }

    // Métodos con sobrecarga
    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public int restar(int num1, int num2) {
        return num1 - num2;
    }

    public double restar(double num1, double num2) {
        return num1 - num2;
    }

    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN; 
        }
    }

   
}
