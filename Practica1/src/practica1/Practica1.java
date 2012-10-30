/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Jorge Dominguez J
 */
public class Practica1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
     
            
    {
         System.out.print("INSTITUTO TECNOLOGICO SUPERIOR DE ESCARCEGA\n\n ROBERT ALEXANDER RAMIREZ CHABLE\n\n ELIGIR OPCION: 1,2,3,4,5");
       
         
        int opcion=0;
        Scanner lectura = new Scanner(System.in);
        
          
          opcion=lectura.nextInt();
          
          
          switch (opcion)
          
          {
              case 1:
                  
                  System.out.print("Este programa fue creado con el objetivo de invertir cadenas,mostrar lo largo de la cadena,y dependiendo de la opcion que eliga es la funcion que realizara.");
                  break;
                  
                  case 2:
                  
                  String robert=lectura.next();
                  for(int i=robert.length() - 1; i >= 0; i--)
                  {
                      char c = robert.charAt(i);
                      System.out.print(c);
                  }
                  break;

                  case 3:
                     String palabra = lectura.next();
                    System.out.println("El largo de la Cadena es : " + palabra.length());
                 break;
                      
                 

                      
       
    }
    }
}
