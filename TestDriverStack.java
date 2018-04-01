/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdriverstack;

import java.util.Random;
import linkedliststack.Menu;
import linkedliststack.Node;

/**
 *
 * @author ATESXB
 */
public class TestDriverStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node top = new Node(null);
        top.setValue('a'); 
        testPush(top);
        
        testPop(top);
    }
    
    public static Node makeStackEmpty(){ // Is it enough to return null here, or 
        return null;                    // do I need to adjust the reference 
    }                                   // within the node as well? 
    
    public static boolean isEmpty(Node top){
        return (top == null);
    }
    
    public static void testPush(Node top){ // Make it possible to take an argument of arbitrary data type
        
        Menu testObj = new Menu();
        // *** Push to an empty stack ***
        // Arrange
        top = makeStackEmpty();
        Random r = new Random();
        char testValue = (char)(r.nextInt(26) + 'a'); // Random character from a-w
        
        // Act
        top = testObj.push(top, testValue);
        
        //Assert
        if(top.getValue() == testValue){
            System.out.println("TD: Push to an empty stack: succeed!");
        }else{
            System.out.println("TD: Push to an empty stack: failed!");
        }
        
        // *** Push to a stack with three elements already ***
        // Arrange
        top = makeStackEmpty();
        int numberElm = 3;
        for(int i=1; i<numberElm; i++){
            testValue = (char)(i + 'a');
            
            top = testObj.push(top, testValue);
        }
        
        // Act 
        testValue = (char)(numberElm + 'a'); // Garanties that the top element 
                                             // is not equal to any of the other
                                             // elements on the stack
        top = testObj.push(top, testValue);
        
        // Assert
        if(top.getValue() == testValue){
            System.out.println("TD: Push to a stack with three elements already: succeed!");
        }else{
            System.out.println("TD: Push to a stack with three elements already: failed!");
        }
        
        // *** Dont't add to a full stack *** 
    
    }
    
    public static void testPop(Node top){
        
        Menu menuTesting = new Menu();
        
        // *** Pop an element from a stack with one element ***
        // Arrange
        top = makeStackEmpty();
        Node testNode = new Node(top);
        testNode.setValue('1');
        
        // Act
        Node returnedNode = menuTesting.pop(top);
        
        // Assert
        if(isEmpty(returnedNode)){
            System.out.println("TD: Pop an element from a stack with one element: succeed!");
        }else{
            System.out.println("TD: Pop an element from a stack with one element: failed!");
        }
        
        // *** Pop an element from a stack with two elements ***
        // Arrange
        top = makeStackEmpty();
        
        int numberElm = 2;
        char testValue;
        for(int i=1; i<=numberElm; i++){
            testValue = (char)(i + 'a');
            testNode = new Node(top);
            testNode.setValue(testValue);
            top = testNode;
        }
        
        // Act
        top = menuTesting.pop(top);
        
        // Assert
        if(top.getValue() == (char)( (numberElm-1) + 'a')){ // Simplify? 
            System.out.println("TD: Pop an element from a stack with two elements: succeed!");
        }else{
            System.out.println("TD: Pop an element from a stack with two elements: failed!");
        }
        
        
        
        // *** Pop an element from a stack with four elements ***
        //Arrange 
        top = makeStackEmpty();
        numberElm = 4;
        for(int i=1; i<=numberElm; i++){
            testValue = (char)(i + 'a');
            testNode = new Node(top);
            testNode.setValue(testValue);
            top = testNode;
        }
        
        // Act
        top = menuTesting.pop(top);
        
        // Assert
        if(top.getValue() == (char)( (numberElm-1) + 'a')){ // Simplify? 
            System.out.println("TD: Pop an element from a stack with four elements: succeed!");
        }else{
            System.out.println("TD: Pop an element from a stack with four elements: failed!");
        }
        // Remove code repitition? 
        
    }
}
