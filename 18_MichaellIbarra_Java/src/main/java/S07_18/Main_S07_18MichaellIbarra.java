/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S07_18;

import java.util.Scanner;

/**
 *
 * @author Lab22
 */
public class Main_S07_18MichaellIbarra {

    public static void main(String[] args) {

        persona1_18 persona1 = new persona1_18("Juan", 30);
        persona1_18 persona2 = new persona1_18("María", 25);

        persona1.saludar();
        persona2.saludar();

        persona2_18 persona3 = new persona2_18("Juan", 30);
        persona2_18 persona4 = new persona2_18("María", 25);
        System.out.println(persona3.saludar());
        System.out.println(persona4.saludar());
    }
}
