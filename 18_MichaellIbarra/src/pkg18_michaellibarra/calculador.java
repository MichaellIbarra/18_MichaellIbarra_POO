/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg18_michaellibarra;

/**
 *
 * @author Matichelo
 */
public class calculador {

    private int a;
    private int b;

    public void sumar(int c, int e) {
        a = c + e;
        System.out.println("Suma: " + a);
    }

    public void sumar(int c) {
        a = c;
        System.out.println(" un entero: " + a);
    }

    public void sumar(String o) {
        System.out.println("El numero es: " + o);
    }

    public int obtenerResultado() {
        return a;
    }
}
