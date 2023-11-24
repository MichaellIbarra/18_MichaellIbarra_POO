/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S08_18;

/**
 *
 * @author Matichelo
 */
public class Protected {
    
    protected String name;

    protected void saludar() {
        System.out.println("Me llamo " + name);
    }

    protected void setNombre(String nombre) {
        this.name = nombre;
    }

    protected String getNombre() {
        return name;
    }
}
