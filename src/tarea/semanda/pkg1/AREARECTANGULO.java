/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.semanda.pkg1;

import java.util.Scanner;

/**
 *
 * @author Dino Computers
 */
public class AREARECTANGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner lector=new Scanner(System.in);
        double base;
        double altura;
        double A;
        
        System.out.println("ingresar la base");
        base=lector.nextInt();
        System.out.println("ingresar altura");
        altura=lector.nextInt();
        //proceso
        A=(base*altura);
        
        //salidad de datos
        System.out.println("EL area DEL RECTANGULO ES " +A);   
    }
    
}
