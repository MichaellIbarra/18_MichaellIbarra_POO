/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg18_michaellibarra;

import java.util.Scanner;
import static pkg18_michaellibarra.S07_calculadora1.realizarOperacion;
import static pkg18_michaellibarra.S07_calculadora2.dividir;
import static pkg18_michaellibarra.S07_calculadora2.multiplicar;
import static pkg18_michaellibarra.S07_calculadora2.restar;
import static pkg18_michaellibarra.S07_calculadora2.sumar;

/**
 *
 * @author Lab05
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* //Para calculadora con Scanner
        calculadora calculadora = new calculadora();
        calculadora.preguntar();
        calculadora.sumar();
        calculadora.restar();
        calculadora.multiplicar();
        calculadora.dividir();
         */
 /* //Para Persona con Scanner
        persona persona = new persona();
        persona.preguntar();
        persona.hablar();
        persona.orden();
         */
 /* //Para Auto con JOptionPane
        auto auto1 = new auto();
        auto1.preguntar();

        auto1.acelerar();
        auto1.frenar();
        auto1.sonido(); */

 /* //para Aimal con JOptionPane
        animal animal1 = new animal();

        animal1.preguntar();
        animal1.mostrarInformacion();
        animal1.emitirSonido();
         */
 /* Pais pais1 = new Pais();
        Pais pais2 = new Pais(); */
        //pais1.nombre = "Peru";
        //pais1.cantidadPersonas = 33000000;
        //pais1.deudas = 5000000;
        //pais1.moneda = "sol";
        //pais1.pregunta();
        //pais1.deuda();
        //pais1.pregunta();
        /* pais1.nombre = "peru";
        pais1.moneda = "sol";

        pais2.nombre = "argentina";
        pais2.moneda = "peso";

        String b = pais1.mon();
        String c = pais2.mon();

        System.out.println(b + "   " + c); */
        //int a = pais1.deudas();
        //System.out.println(a);
        //System.out.println(pais1.deuda());
        /* calculador cal = new calculador();

        cal.sumar(2);
        cal.sumar("Michaell");
        cal.sumar(2, 2);

        int resultado = cal.obtenerResultado();
        System.out.println("Total " + resultado); */
        //LO QUE PIDIO PRIMERO SOBRE CLASE PERSONA
        classPesona objpersona1 = new classPesona();
        objpersona1.nombre = "Michaell";
        objpersona1.apellidos = " Ibarra ";
        objpersona1.edad = 18;
        objpersona1.lugardeNacimiento = " Perú ";
        objpersona1.ocupacion = " Programador ";

        objpersona1.cambiarNombre("Matichelo");
        objpersona1.cambiarEdad(19);
        objpersona1.saludar();

        // S07_calculadora1 SOBRE LA CALCULADORA
        S07_calculadora1 calcula = new S07_calculadora1();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Ingrese la operación (+, -, *, /): ");
        String operacion = scanner.next();

        calcula.realizarOperacion(numero1, numero2, operacion);

        // S07_calculadora1 SOBRE LA CALCULADORA
        S07_calculadora2 calcula2 = new S07_calculadora2();
        System.out.println("Resultado de la suma: " + calcula2.sumar(numero1, numero2));
        System.out.println("Resultado de la resta: " + calcula2.restar(numero1, numero2));
        System.out.println("Resultado de la multiplicación: " + calcula2.multiplicar(numero1, numero2));
        System.out.println("Resultado de la división: " + calcula2.dividir(numero1, numero2));
    }

}
