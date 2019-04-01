/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class CapturaTeclado {
    
    public void operacion(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String a = entrada.nextLine();
        System.out.println("hola " + a);
        
        
    }
}
