/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S15_P2;

/**
 *
 * @author Matichelo
 */
public class cuentabancaria {
    String numeroCuenta, titular, nombreyapellido;
    double dinerototal, dineroRetirar;
    
    public void numeroC(){
        System.out.println("introducir el número de cuenta"+ numeroCuenta);
    }
     public void titular(){
        System.out.println("titular de cuenta"+ titular);
    }
      public void fullname(){
        System.out.println("nombre y apellidos completos del titular"+ nombreyapellido);
    }
       public void dinerototal(){
        System.out.println("total de dinero"+ dinerototal);
    }
         public void dineroRetirar(){
        System.out.println("dinero retirar"+ dineroRetirar);
    }
}
