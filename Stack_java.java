/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_java;

import java.util.Scanner;

/**
 *
 * @author ATESXB
 */
public class Stack_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean runProgram = true;
        
        Node myNode = new Node();

        while(runProgram){
            System.out.print("What do you want to do?\n 1: Push to stack\n 2: Pop from stack\n 3: Print all elements on the stack\n 4: Exit\n");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            
            switch (n){
                
                case 1 :  Node topNode;
                    topNode = new Node();
                    System.out.println("Enter value: ");
                    char userChar = input.next().charAt(0);
                    topNode.setValue(userChar);
                    break;
                case 2 : runProgram=false;
                    break;
                case 3 : runProgram=false;
                    break;
                case 4 : runProgram = false;
                    break;
                       
            }    
        }
        
    }
    
}
