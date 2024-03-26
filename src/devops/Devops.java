/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devops;

import java.util.Scanner;

public class Devops {
    
    static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.println("Main menu");
            System.out.println("1. check odd or even");
            System.out.println("2. exit");
            
            int option = input.nextInt();
            switch(option){
                case 1:
                    checkoddoreven();
                    break;
                case 2:
                    exit();
                    break;
                    
                default:
                    System.out.println("Invalid option selected");
            }
    }
     
     static void checkoddoreven(){
          int n;
       System.out.println("enter number: ");
       
    n = input.nextInt();
    
    if(n % 2 == 0 )
        System.out.println("number is even");
    else{
        System.out.println("number is odd");
    }
     }
     
     static void exit(){
           System.out.print("closing the app");
           System.exit(0);
     }
    
}
