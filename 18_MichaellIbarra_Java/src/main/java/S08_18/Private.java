/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S08_18;

/**
 *
 * @author Matichelo
 */
public class Private {

    private String name;

    private void saludar() {
        System.out.println("Me llamo " + name);
    }

    public void ejecutarSaludo() {
        saludar();
    }


    public void setNombre(String nombre) {
        this.name = nombre;
    }

    public String getNombre() {
        return name;
    }
}
