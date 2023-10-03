/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S07V2_18;

/**
 *
 * @author Lab22
 */
public class Main_S07V2_18 {
    public static void main(String[] args) {
        
        persona_18 objpersona1 = new persona_18();
        objpersona1.nombre = "Michaell";
        objpersona1.apellidos = " Ibarra ";
        objpersona1.edad = 18;
        objpersona1.lugardeNacimiento = " Perú ";
        objpersona1.ocupacion = " Programador ";

        objpersona1.cambiarNombre("Matichelo");
        objpersona1.cambiarEdad(19);
        objpersona1.saludar();
    }
}
