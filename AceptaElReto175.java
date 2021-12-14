/*
Resolucion del problema de aceptaelreto.com numero 175
https://www.aceptaelreto.com/pub/problems/v001/75/st/statements/Spanish/index.html


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividades;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class Pastillas {
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner (System.in);
        
        System.out.println("Introduce el numero de casos");
        int casos = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < casos; i++) {
            
            System.out.println("Introduce el numero de listas");
            int listas =sc.nextInt();
            sc.nextLine();
             String[]pastillas=new String[listas];
            for (int j = 0; j < listas; j++) {
                pastillas[j]=sc.nextLine();
            
        }
            
            int[]dias= new int[7];
            for (int col = 0; col <7; col++) {
                for (int fil = 0; fil < listas; fil++) { 
                    if(pastillas[fil].charAt(col)=='*')
                        dias[col]++;
                    
                }
            }
            for (int j = 0; j < dias.length; j++) {
                System.out.println(dias[j]+"");
                
            }
            
           
                
            }
        
        
        
    }
    
}
