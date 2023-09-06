/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg18_michaellibarra;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab05
 */
public class auto {

    String marca, color;
    double km;

    public void acelerar() {
        String mensaje = "El auto de color " + color + " acelera a " + km + " km/h";
        JOptionPane.showMessageDialog(null, mensaje, "Acelerando", JOptionPane.PLAIN_MESSAGE);
    }

    public void frenar() {
        JOptionPane.showMessageDialog(null, "Estoy frenando", "Frenando", JOptionPane.PLAIN_MESSAGE);
    }

    public void sonido() {
        String mensaje = "Mi auto suena como un " + marca;
        JOptionPane.showMessageDialog(null, mensaje, "Sonido del Auto", JOptionPane.PLAIN_MESSAGE);
    }

    public void preguntar() {
        marca = JOptionPane.showInputDialog("Ingrese la marca de su auto:");
        color = JOptionPane.showInputDialog("Ingrese el color de su auto:");
        String kmStr = JOptionPane.showInputDialog("Ingrese la velocidad en km/h:");
        km = Double.parseDouble(kmStr);
    }
}
