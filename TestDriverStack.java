/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdriverstack;

import linkedliststack.Stack;

/**
 *
 * @author ATESXB
 */
public class TestDriverStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testPush();
        testPop();
    }
    
    
    public static void testPush(){ 
        
        Stack testStack = new Stack();
        char inputChar;
        
        int [] numberElmList = {0,1,2,3}; 
        for (int numberElm : numberElmList){
            
            // Arrange
            for(int i=0; i<numberElm; i++){
                
                inputChar = (char)(i + 'a');
                testStack.push(inputChar);
            }

            // Act 
            inputChar = (char)(numberElm + 'a'); // Unique top element                          
            testStack.push(inputChar);
            
            // Assert
            if(testStack.peek() == inputChar){
                System.out.printf("TD: Push to a stack with %d element%c: succeed!\n",numberElm, numberElm==1 ? ' ' : 's');
            }else{
                System.out.printf("TD: Push to a stack with %d element%c: failed!\n",numberElm, numberElm==1 ? ' ' : 's');
            }
        }
    
    }
    
    public static void testPop(){
        
        Stack testStack = new Stack();
        char inputChar;
        char popValue;
               
        int [] numberElmList = {0,1,2,3,7}; // List with the number of elements on the stack 
        for (int numberElm : numberElmList){
            
            // Arrange
            for(int i=1; i<=numberElm; i++){
                
                inputChar = (char)(i + 'a');
                testStack.push(inputChar);
            }
            
            // Act
            popValue = testStack.pop();
        
            // Assert
            if(numberElm>1){
                if(popValue == (char)( (numberElm) + 'a')){ 
                    System.out.printf("TD: Pop an element from a stack with %d elements: succeed!\n",numberElm);
                }else{
                    System.out.printf("TD: Pop an element from a stack with %d elements: falied!\n",numberElm);
                }
            }
            
            if(numberElm==1){
                if(testStack.peek() == ' '){
                    System.out.printf("TD: Pop an element from a stack with %d element: succeed!\n",numberElm);
                }else{
                    System.out.printf("TD: Pop an element from a stack with %d element: succeed!\n",numberElm);
                }
            }
            
            if(numberElm==0){
                if(testStack.peek() == ' '){
                    System.out.printf("TD: Don't pop from an empty stack: succeed!\n");
                }else{
                    System.out.printf("TD: Don't pop from an empty stack: failed!\n");
                }
            }
        }
        
    }
}
