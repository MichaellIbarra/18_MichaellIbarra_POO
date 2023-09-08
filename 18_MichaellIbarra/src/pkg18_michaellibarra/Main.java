/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg18_michaellibarra;

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
        Pais pais1 = new Pais();
        Pais pais2 = new Pais();
        //pais1.nombre = "Peru";
        //pais1.cantidadPersonas = 33000000;
        //pais1.deudas = 5000000;
        //pais1.moneda = "sol";
        //pais1.pregunta();
        //pais1.deuda();

        //pais1.pregunta();
        pais1.nombre = "peru";
        pais1.moneda = "sol";

        pais2.nombre = "argentina";
        pais2.moneda = "peso";

        String b = pais1.mon();
        String c = pais2.mon();

        System.out.println(b + "   " + c);

        //int a = pais1.deudas();
        //System.out.println(a);
        //System.out.println(pais1.deuda());
        
        calculador cal = new calculador();

        cal.sumar(2);
        cal.sumar("Michaell");
        cal.sumar(2, 2);

        int resultado = cal.obtenerResultado();
        System.out.println("Total " + resultado);
    }

}
