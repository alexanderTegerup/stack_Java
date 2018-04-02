/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedliststack;

import java.util.Scanner;

/**
 *
 * @author ATESXB
 */
public class LinkedListStack {

    /**
     * @param args the command line arguments
     */
    
    
     public static void main(String[] args) {
        
        boolean runProgram = true;
        Node top = null;
        
        Menu method = new Menu();
        
        while(runProgram){
            System.out.print("What do you want to do?\n 1: Push to stack\n 2: Pop from stack\n 3: Print all elements on the stack\n 4: Exit\n");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            
            switch (n){
                
                case 1 : System.out.println("Enter value: ");
                    char userChar = input.next().charAt(0);
                    top = method.push(top,userChar);
                    break;
                    
                case 2 : top = method.pop(top);
                    break;
                    
                case 3 : method.printAll(top);
                    break;
                    
                case 4 : runProgram = false;
                    break;
                       
            }    
        }
        
    }
    
}
    

