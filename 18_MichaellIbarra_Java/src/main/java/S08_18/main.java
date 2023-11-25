/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S08_18;

/**
 *
 * @author Matichelo
 */
public class main {

    public static void main(String[] args) {

        // Defult
        Defult objDefult = new Defult();
        objDefult.name = "Michaell";
        objDefult.presentacion();

        //Modificador de Acceso Private
        Private objPriv = new Private();
        objPriv.setNombre("Matichelo");
        objPriv.ejecutarSaludo();

        //Modificador de Acceso Protected
        Protected objProtec = new Protected();
        objProtec.setNombre("Juan");
        objProtec.saludar();

        //Modificador de Acceso Publico
        Public objPu = new Public();
        objPu.animal = "Gato";
        objPu.llamar();
    }

}
