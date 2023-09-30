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
public class estudiante_18 {
    // Atributos
    String nombre;
    String apellido;
    int edad;

    // Constructores
    public estudiante_18() {
    }

    public estudiante_18(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // Métodos
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad + " años");
    }

    // Métodos con valores de retorno
    public String obtenerNombreCompleto() {
        return nombre + " " + apellido;
    }

    // Sobrecarga de métodos
    public void saludar() {
        System.out.println("¡Hola! Soy " + nombre);
    }

    public void saludar(String saludoPersonalizado) {
        System.out.println(saludoPersonalizado + " Soy " + nombre);
    }

   
}
