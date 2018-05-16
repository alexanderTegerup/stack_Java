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
    
    public void push(char userChar){
        
        Node tempRef =  new Node();
        tempRef.nodeValue = userChar;
        tempRef.prevNode = top;
        top = tempRef;
    }
    
    public char pop(){
        
        if(top != null){
            
            char popValue;
            popValue = top.nodeValue;
            top = top.prevNode;
            
            return popValue;
            
        }else{
            return ' ';
        }
    }
    
    public char peek(){
        
        if(top == null){
            
            return ' ';
        }else{
            
            return top.nodeValue;
        }
    }
    
}
