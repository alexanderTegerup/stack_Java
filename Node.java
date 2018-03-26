package stack_java;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ATESXB
 */
public class Node {
    
   private char nodeValue; 
   private Node prevNode;
   
   public Node(Node nodeRef){ // Constructor
       prevNode = nodeRef;
   }
   
   
   public void setValue(char value){
       nodeValue = value;
   }
   public char getValue(){
       return nodeValue;
   }
   
   public Node getReference(){
       return prevNode;
   }
}
