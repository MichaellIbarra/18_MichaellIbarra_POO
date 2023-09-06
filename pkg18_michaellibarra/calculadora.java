/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg18_michaellibarra;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Lab05
 */
public class calculadora {

    int a;
    int b;
    int totalsuma;
    int totalresta;
    int totalmultiplicar;
    int totaldivision;

    public void sumar() {
        totalsuma = a + b;
        System.out.println("La suma es: " + totalsuma);
    }

    public void restar() {
        totalresta = a - b;
        System.out.println("La resta es: " + totalresta);
    }

    public void multiplicar() {
        totalmultiplicar = a * b;
        System.out.println("La multiplicación es: " + totalmultiplicar);
    }

    public void dividir() {
        if (b != 0) {
            totaldivision = a / b;
            System.out.println("La división es: " + totaldivision);
        } else {
            System.out.println("No es posible dividir por cero.");
        }
    }

    public void preguntar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        a = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        b = scanner.nextInt();
        scanner.close();
    }

}
