/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S07V2_18;

/**
 *
 * @author Lab22
 */
public class persona_18 {
    //atributos

    String nombre, apellidos, lugardeNacimiento, ocupacion;
    int edad;

    //metodos
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre + apellidos + "tengo de edad " + edad + " vivo en " + lugardeNacimiento + " mi ocupación es" + ocupacion);
    }

    //sobrecarga de metodo
    public void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }

    public void saludar(String nombre, String apellido) {
        System.out.println("Hola, " + nombre + " " + apellidos + "!");
    }

    //retorno
    public String getNombre() {
        return "Estiven";
    }

    public int getEdad() {
        return 10;
    }

    // Métodos con parámetros y argumentos
    public void cambiarNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    public void cambiarEdad(int nuevaEdad) {
        edad = nuevaEdad;
    }
}
