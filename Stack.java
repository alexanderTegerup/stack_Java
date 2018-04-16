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
    private char popValue;
    
    public void push(char userChar){
        Node tmpRef;
        tmpRef = top;
        top = new Node();
        top.nodeValue = userChar;
        top.prevNode = tmpRef;
    }
    
    public char pop(){
        if(top != null){
            popValue = top.nodeValue;
            top = top.prevNode;
            return popValue;
        }else{
            System.out.println("The stack is empty.");
            return ' ';
        }
    }
    
    public char peek(){
        if(top == null){
            System.out.println("The stack is empty.");
            return ' ';
        }else{
            return top.nodeValue;
        }
    }
    
}
