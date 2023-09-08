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
public class animal {

    String especie;
    String color;
    double peso;

    public void mostrarInformacion() {
        String informacion = "Especie: " + especie + "\n"
                + "Color: " + color + "\n"
                + "Peso: " + peso + " kg";
        JOptionPane.showMessageDialog(null, informacion, "Información del Animal", JOptionPane.INFORMATION_MESSAGE);
    }

    public void emitirSonido() {
        JOptionPane.showMessageDialog(null, "El animal emite un sonido característico");
    }

    public void mover() {
        JOptionPane.showMessageDialog(null, "El animal se está moviendo");
    }

    public void preguntar() {
        especie = JOptionPane.showInputDialog("Ingrese la especie del animal:");
        color = JOptionPane.showInputDialog("Ingrese el color del animal:");
        String pesoStr = JOptionPane.showInputDialog("Ingrese el peso del animal en kg:");
        peso = Double.parseDouble(pesoStr);
    }

}
