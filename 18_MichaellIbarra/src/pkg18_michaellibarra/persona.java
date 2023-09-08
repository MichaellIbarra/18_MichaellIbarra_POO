/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg18_michaellibarra;

import java.util.Scanner;

/**
 *
 * @author Lab05
 */
public class persona {

    String nombre;
    int edad;

    public void hablar() {
        System.out.println(nombre + " Hola");
    }

    public void orden() {
        System.out.println(nombre + " levantar la mano");
    }

    public void preguntar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese la edad: ");
        edad = scanner.nextInt();
        scanner.close();
    }
}
