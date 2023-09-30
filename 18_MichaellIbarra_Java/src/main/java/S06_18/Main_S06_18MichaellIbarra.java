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
public class Main_S06_18MichaellIbarra {

    public static void main(String[] args) {
        
        //estudiante
        estudiante_18 estudiante = new estudiante_18("Michaell", "Ibarra", 17);
        estudiante.mostrarInformacion();
        estudiante.saludar();
        estudiante.saludar("¡Hola a todos!");
        System.out.println("Nombre Completo: " + estudiante.obtenerNombreCompleto());
        
        //calculadora
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        // Uso del constructor con valores predeterminados
        calculadora_18 calculadora = new calculadora_18(num1, num2);
    }
}
