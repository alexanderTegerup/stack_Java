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
        Node top = null;
        
        while(runProgram){
            System.out.print("What do you want to do?\n 1: Push to stack\n 2: Pop from stack\n 3: Print all elements on the stack\n 4: Exit\n");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            
            switch (n){
                
                case 1 : Node addNode;
                
                    addNode = new Node(top);
                    System.out.println("Enter value: ");
                    char userChar = input.next().charAt(0);
                    addNode.setValue(userChar);
                    top = addNode;
                    break;
                    
                case 2 : if(top != null){
                    top = top.getReference();
                }else{
                    System.out.println("The stack is empty.");
                }
                    break;
                    
                case 3 : if(top == null){
                    System.out.println("The stack is empty.");
                }else{
                    while(top.getReference()!=null){
                    System.out.printf("Top value: %c\n", top.getValue());
                    top = top.getReference();
                    }
                    System.out.printf("Top value: %c\n", top.getValue());
                    top = top.getReference();
                }
                    break;
                case 4 : runProgram = false;
                    break;
                       
            }    
        }
        
    }
    
}
