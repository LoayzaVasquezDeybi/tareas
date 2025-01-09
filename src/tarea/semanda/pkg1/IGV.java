/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.semanda.pkg1;
import java.util.Scanner;
/**
 *
 * @author Dino Computers
 */
public class IGV {
    public static void main(String[] args) {
                Scanner lector=new Scanner(System.in);
        double monto;
        double descuento;
        final double IGV = 0.18 ;
        
        System.out.println("ingresar el monto");
        monto=lector.nextInt();
   
        //proceso
        descuento=monto-(monto*IGV);
        
        //salidad de datos
        System.out.println("EL descuento aplicado es  " +descuento);   
    }
    
}