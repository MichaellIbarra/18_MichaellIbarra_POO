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
public class libro_18 {
    
    String nombreLibro;
    String categoria;
    String autor;
    int añoPublicacion;
    int numeroPaginas;

    public void mostrarInformacion() {
        String informacion = "Nombre del Libro: " + nombreLibro + "\n"
                + "Categoría: " + categoria + "\n"
                + "Autor: " + autor + "\n"
                + "Año de Publicación: " + añoPublicacion + "\n"
                + "Número de Páginas: " + numeroPaginas;
        JOptionPane.showMessageDialog(null, informacion, "Información del Libro", JOptionPane.INFORMATION_MESSAGE);
    }

    public void preguntar() {
        nombreLibro = JOptionPane.showInputDialog("Ingrese el nombre del libro:");
        categoria = JOptionPane.showInputDialog("Ingrese la categoría del libro:");
        autor = JOptionPane.showInputDialog("Ingrese el autor del libro:");
        String añoStr = JOptionPane.showInputDialog("Ingrese el año de publicación del libro:");
        añoPublicacion = Integer.parseInt(añoStr);
        String paginasStr = JOptionPane.showInputDialog("Ingrese el número de páginas del libro:");
        numeroPaginas = Integer.parseInt(paginasStr);
    }
}
