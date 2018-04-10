/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdriverstack;

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
        Node top = new Node(); 
        
        testPush(top);
        testPop(top);
    }
    
    public static Node makeStackEmpty(){ // Is it enough to return null here, or 
        return null;                    // do I need to adjust the reference 
    }                                   // within the node as well? 
    
    public static boolean isEmpty(Node top){
        return (top == null);
    }
    
    public static void testPush(Node top){ 
        
        Menu testObj = new Menu();
        char testValue;
        
        int [] numberElmList = {0,1,2,3}; 
        for (int numberElm : numberElmList){
            
            // Arrange
            top = makeStackEmpty();  
            for(int i=0; i<numberElm; i++){
                top = new Node(top);
                testValue = (char)(i + 'a');
                top.setValue(testValue);
            }

            // Act 
            testValue = (char)(numberElm + 'a'); // Garanties that the top element 
                                             // is not equal to any of the other
                                             // elements on the stack
            top = testObj.push(top, testValue);
            
            
            // Assert
            if(top.getValue() == testValue){
                System.out.printf("TD: Push to a stack with %d element%c: succeed!\n",numberElm, numberElm==1 ? ' ' : 's');
            }else{
                System.out.printf("TD: Push to a stack with %d element%c: failed!\n",numberElm, numberElm==1 ? ' ' : 's');
            }
        }
        
        // *** Dont't add to a full stack *** 
    
    }
    
    public static void testPop(Node top){
        
        Menu menuTesting = new Menu();
        char testValue;
               
        int [] numberElmList = {0,1,2,3,7}; // List with the number of elements on the stack 
        for (int numberElm : numberElmList){
            
            // Arrange
            top = makeStackEmpty();
            for(int i=1; i<=numberElm; i++){
                testValue = (char)(i + 'a');
                top = new Node(top);
                top.setValue(testValue);
            }
            
            // Act
            top = menuTesting.pop(top);
        
            // Assert
            if(numberElm>1){
                if(top.getValue() == (char)( (numberElm-1) + 'a')){ 
                    System.out.printf("TD: Pop an element from a stack with %d elements: succeed!\n",numberElm);
                }else{
                    System.out.printf("TD: Pop an element from a stack with %d elements: falied!\n",numberElm);
                }
            }
            
            if(numberElm==1){
                if(isEmpty(top)){
                    System.out.printf("TD: Pop an element from a stack with %d element: succeed!\n",numberElm);
                }else{
                    System.out.printf("TD: Pop an element from a stack with %d element: succeed!\n",numberElm);
                }
            }
            
            if(numberElm==0){
                if(isEmpty(top)){
                    System.out.printf("TD: Don't pop from an empty stack: succeed!\n");
                }else{
                    System.out.printf("TD: Don't pop from an empty stack: failed!\n");
                }
            }
        }
        
    }
}
