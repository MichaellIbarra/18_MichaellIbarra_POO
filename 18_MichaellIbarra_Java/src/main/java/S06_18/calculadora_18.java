package S06_18;

import java.util.Scanner;

/**
 * Clase que representa una calculadora simple con operaciones básicas.
 * 
 * @author Matichelo
 */
public class calculadora_18 {
    
    // Atributos de instancia
    private double num1;
    private double num2;

    // Constructores con valores predeterminados
    public calculadora_18() {
        // Constructor sin parámetros
    }

    public calculadora_18(double num1, double num2) {
        // Constructor con dos parámetros, num1 y num2
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("Suma: " + sumar());
        System.out.println("Resta: " + restar());
        System.out.println("Multiplicación: " + multiplicar());
        double resultadoDivision = dividir();
        if (!Double.isNaN(resultadoDivision)) {
            System.out.println("División: " + resultadoDivision);
        }
    }

    // Métodos con sobrecarga
    public int sumar(int num1, int num2) {
        // Método para sumar dos números enteros
        return num1 + num2;
    }

    public double sumar(double num1, double num2) {
        // Método para sumar dos números de punto flotante
        return num1 + num2;
    }

    public int restar(int num1, int num2) {
        // Método para restar dos números enteros
        return num1 - num2;
    }

    public double restar(double num1, double num2) {
        // Método para restar dos números de punto flotante
        return num1 - num2;
    }

    public int multiplicar(int num1, int num2) {
        // Método para multiplicar dos números enteros
        return num1 * num2;
    }

    public double multiplicar(double num1, double num2) {
        // Método para multiplicar dos números de punto flotante
        return num1 * num2;
    }

    public double dividir(double num1, double num2) {
        // Método para dividir dos números de punto flotante
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN; // Valor especial para representar "No es un número"
        }
    }

    // Métodos que utilizan los atributos de instancia
    public double sumar() {
        return this.num1 + this.num2;
    }

    public double restar() {
        return this.num1 - this.num2;
    }

    public double multiplicar() {
        return this.num1 * this.num2;
    }

    public double dividir() {
        if (this.num2 != 0) {
            return this.num1 / this.num2;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN;
        }
    }
}
