/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import com.sun.xml.internal.ws.api.pipe.NextAction;
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
         System.out.print("INSTITUTO TECNOLOGICO SUPERIOR DE ESCARCEGA\n\n NOMBRE DEL ALUMNO: ROBERT ALEXANDER RAMIREZ CHABLE\n\n ELIGIR OPCION:\n\n 1 ayuda sobre el funcionamiento\n\n 2 cadena invertida\n\n 3 largo de la cadena\n\n 4 inicio y fin de la subcadena\n\n 5 sacar un intervalo de la cadena");
       
       
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
                      
                 case 4:
                     System.out.println("Ingresar el texto ");
                     String nombre = lectura.next();
                     System.out.println("La subcadena entre la posición 3 y 7 es : " + nombre.substring(3,8));
                     
                 

                break;
                     
                case 5:
                 
                   int Inicial=0;
                   int Final=0;
                     System.out.println("Ingresar el texto ");
                     String ROBERT=lectura.next();
                    

                     System.out.println("Escribe un numero final mayor, menor o igual que:  " + (ROBERT.length( )));
                     Final = lectura.nextInt();              
                     System.out.println("Escribe un numero inicial mayor o Igual a cero pero que sea menor que el numero final ");
                     Inicial = lectura.nextInt();
                     int res = Final-Inicial;
                     System.out.print("El numero de rango de la palabra: " + ROBERT + " es= " );
                     System.out.print(res);
                 break; 
                         
       
    }
    }
}
