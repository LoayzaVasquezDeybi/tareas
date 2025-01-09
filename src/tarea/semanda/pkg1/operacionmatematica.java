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
public class operacionmatematica {
        public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector=new Scanner(System.in);
        double numero1;
        double numero2;
        final double divivicion = 2; 
        double x;
        
        
        System.out.println("ingresar el primer valor");
        numero1=lector.nextInt();
        System.out.println("ingresar ingrese el segundo valor");
        numero2=lector.nextInt();
        //proceso
        x=(numero1-numero2)/divivicion;
        
        //salidad de datos
        System.out.println("EL VALOR DE X ES " +x);  
       }
}
