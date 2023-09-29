/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S05_18;

import javax.swing.JOptionPane;

/**
 *
 * @author Matichelo
 */
public class estudiante_18 {

    String nombre;
    String apellido;
    int edad;
    double peso;

    public void mostrarInformacion() {
        String informacion = "Nombre: " + nombre + "\n"
                + "Apellido: " + apellido + "\n"
                + "Edad: " + edad + " años\n"
                + "Peso: " + peso + " kg";
        JOptionPane.showMessageDialog(null, informacion, "Información del Estudiante", JOptionPane.INFORMATION_MESSAGE);
    }

    public void emitirSonido() {
        JOptionPane.showMessageDialog(null, "El estudiante está participando en clase");
    }

    public void mover() {
        JOptionPane.showMessageDialog(null, "El estudiante se está moviendo hacia su próximo destino");
    }

    public void preguntar() {
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        apellido = JOptionPane.showInputDialog("Ingrese el apellido del estudiante:");
        String edadStr = JOptionPane.showInputDialog("Ingrese la edad del estudiante:");
        edad = Integer.parseInt(edadStr);
    }
}
