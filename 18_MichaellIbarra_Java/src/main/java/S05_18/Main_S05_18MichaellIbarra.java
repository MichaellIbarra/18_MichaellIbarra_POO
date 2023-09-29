/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S05_18;

import java.util.Scanner;

/**
 *
 * @author Matichelo
 */
public class Main_S05_18MichaellIbarra {

    public static void main(String[] args) {
        //=======Estudiante======
        estudiante_18 estudiante = new estudiante_18();
        estudiante.preguntar();
        estudiante.mostrarInformacion();
        estudiante.emitirSonido();
        estudiante.mover();

        //=======Libro======
        libro_18 libro = new libro_18();
        libro.preguntar();
        libro.mostrarInformacion();
        
         //=======Cuenta Bancaria======

        cuenta_bancaria_18 cuenta = new cuenta_bancaria_18();
        cuenta.preguntar();
        cuenta.mostrarInformacion();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto a depositar: $");
        double montoDeposito = scanner.nextDouble();
        cuenta.realizarDeposito(montoDeposito);
        cuenta.mostrarInformacion();

        System.out.print("Ingrese el monto a retirar: $");
        double montoRetiro = scanner.nextDouble();
        cuenta.realizarRetiro(montoRetiro);
        cuenta.mostrarInformacion();
        
        //=======Auto======
        auto_18 auto = new auto_18();
        auto.preguntar();
        auto.mostrarInformacion();
    }
}
