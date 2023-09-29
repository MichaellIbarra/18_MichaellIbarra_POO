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
public class cuenta_bancaria_18 {
      String numeroCuenta;
    String titular;
    double saldo;
    String tipoCuenta;
    String estado;

    public void mostrarInformacion() {
        String informacion = "Número de Cuenta: " + numeroCuenta + "\n"
                + "Titular: " + titular + "\n"
                + "Saldo: $" + saldo + "\n"
                + "Tipo de Cuenta: " + tipoCuenta + "\n"
                + "Estado: " + estado;

        System.out.println(informacion);
    }

    public void realizarDeposito(double monto) {
        saldo += monto;
        System.out.println("Depósito realizado con éxito. Nuevo saldo: $" + saldo);
    }

    public void realizarRetiro(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro realizado con éxito. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar el retiro");
        }
    }

    public void preguntar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de cuenta: ");
        numeroCuenta = scanner.nextLine();

        System.out.print("Ingrese el nombre del titular de la cuenta: ");
        titular = scanner.nextLine();

        System.out.print("Ingrese el saldo inicial de la cuenta: ");
        saldo = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer del Enter

        System.out.print("Ingrese el tipo de cuenta: ");
        tipoCuenta = scanner.nextLine();

        System.out.print("Ingrese el estado de la cuenta (activa, inactiva, bloqueada): ");
        estado = scanner.nextLine();
    }


}
