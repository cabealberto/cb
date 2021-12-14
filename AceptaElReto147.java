/*

//Problemas acepta el reto
https://www.aceptaelreto.com/problem/statement.php?id=174

Mary lleva muchos años redactando cartas para sus jefes. Cuando comenzó el año 2013, observó con fastidio que al poner la fecha se veía obligada a utilizar más teclas diferentes que otras veces. Empezó a hacer memoria y se dio cuenta de que, tras 25 años, el año 2013 era el primero que tenía sus cuatro dígitos diferentes. Desde 1988, todos los años habían tenido al menos un dígito repetido.

La serie de años sin dígitos repetidos que comienza con 2013 terminará en 2019. En 2020 comenzará una serie nueva de números con dígitos repetidos, que se mantendrá hasta el 2030, incluído.
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
public class Años {
    
    public static void main (String[]args){
        
        Scanner sc=new Scanner (System.in);
       
        
     
      int año=sc.nextInt();
      sc.nextLine();
      
        
        if (comprobarAño(año)==true){
          int primero=añosatrastrue(año);
          int segundo=añosaalantetrue(año);
          int numero = segundo - primero;
          System.out.println(primero+" "+numero);
      }
      
      else{
          
          int primero=añosatrasfalse(año);
          int segundo=añosaalantefalse(año);
          int numero = segundo - primero;
          System.out.println(primero+" "+numero);
      }
    
      }
      
     
           
          
           
           
    
  public static boolean comprobarAño(int año){
      
       Scanner sc=new Scanner (System.in);
        int contador =0;
         String numCadena= String.valueOf(año);
        char [] caracteres=numCadena.toCharArray();
        int[]numeros=new int[caracteres.length];
        boolean casos=false;
        int indice=0;
        for(int i =0; i<caracteres.length;i++){
            numeros[i]=Integer.parseInt(String.valueOf(caracteres[i]));
            
            
        }
      
            for(int i=0;i<numeros.length;i++){
                for (int j=0;j<numeros.length;j++ ){
                if(numeros[i]==numeros[j] && i != j){
                    casos=true;
                }
               
           
      }  
    }
            return casos;
  }
  
  public static int añosatrastrue(int año){
      
     
           do{
               año--;
               
           }while (comprobarAño(año)==true);
          
          año++;
      return año;
      
  }
  
  public static int añosaalantetrue(int año){
      
    
           do{
               año++;
              
           }while (comprobarAño(año)==true);
           
          
      return año;
  }
  public static int añosatrasfalse(int año){
      
     
           do{
               año--;
               
           }while (comprobarAño(año)==false);
          
           año++;
      return año;
      
  }
  
  public static int añosaalantefalse(int año){
      
      
           do{
               año++;
              
           }while (comprobarAño(año)==false);
           
          
      return año;
  }
    
    }
