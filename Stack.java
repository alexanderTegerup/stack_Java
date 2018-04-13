/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedliststack;

/**
 *
 * @author ATESXB
 */
public class Stack {
    
    private Node top; 
    char popValue;
    
    public void push(char userChar){
        top = new Node(top);
        top.setValue(userChar);
    }
    
    public char pop(){
        if(top != null){
            popValue = top.getValue();
            top = top.getReference();
            return popValue;
        }else{
            System.out.println("The stack is empty.");
            return ' ';
        }
    }
    
    public void peek(){
        if(top == null){
            System.out.println("The stack is empty.");
        }else{
            System.out.printf("Top value: %c\n", top.getValue());
        }
    }
    
}
