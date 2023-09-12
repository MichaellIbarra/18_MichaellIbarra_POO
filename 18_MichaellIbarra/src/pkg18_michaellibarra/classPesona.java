/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg18_michaellibarra;

/**
 *
 * @author Matichelo
 */
public class classPesona {
    
    //atributos
    String nombre, apellidos, lugardeNacimiento, ocupacion;
    int edad;
    
    //metodos
    public void saludar(){
        System.out.println("Hola, mi nombre es "+ nombre + apellidos + "tengo de edad " + edad + " vivo en "+ lugardeNacimiento + " mi ocupación es" + ocupacion);
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
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

      
}
