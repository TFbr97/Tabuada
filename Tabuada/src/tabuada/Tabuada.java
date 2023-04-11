/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabuada;

import java.util.Scanner;

/**
 *
 * @author 62127512022.2
 */
public class Tabuada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
               
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Você deseja fazer uma tabuada? Digite S ou N");
        String control = scanner.nextLine();       
              
       
           
            System.out.println("Qual tabuada deseja fazer?");
            int num = scanner.nextInt();
            int result = 0;
            System.out.println("Tabuada de " + num);
            
            for (int i = 0; i <= 10; i++){
                
               result = num * i;
               
               
               
               System.out.print(num + "*" + i + "=" + result + "\n");
               
               
                
                
            }
            
      
        
        
    }
    
}
