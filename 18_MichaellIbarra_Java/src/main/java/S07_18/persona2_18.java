/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S07_18;

/**
 *
 * @author Lab22
 */
public class persona2_18 {

    public String nombre;
    public int edad;

    public persona2_18(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String saludar() {
        return "Hola, soy " + nombre + " y tengo " + edad + " años.";
    }

   
}
