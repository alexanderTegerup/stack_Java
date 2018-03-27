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
public class Menu {
    
    Scanner input = new Scanner(System.in);
    public Node push(Node top){//, char testValue){
        Node addNode;
        addNode = new Node(top);
        System.out.println("Enter value: ");
        char userChar = input.next().charAt(0);
        addNode.setValue(userChar);
        return addNode;
    }
    
    public Node pop(Node top){
        if(top != null){
            return top.getReference();
        }else{
            System.out.println("The stack is empty.");
            return top;
        }
    }
    
    public void printAll(Node top){
        if(top == null){
            System.out.println("The stack is empty.");
        }else{
            while(top!=null){
                System.out.printf("Top value: %c\n", top.getValue());
                top = pop(top);
            }
        }
    }
}
