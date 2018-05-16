/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdriverstack;

//import linkedliststack.Stack; //Alex stack
import app.Stack; // Aziz stack 
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
    
    private static void assert_push(int elmPush, int elmPop, char testVal, Stack testStack) {
        
        int diff = elmPush - elmPop;
        if(diff > 0) {
            
            if(testVal == (char)( diff+1 + 'a')){ 
                    System.out.printf("TD: Add %d elements and pop %d elements: succeed!\n",elmPush, elmPop);
                }else{
                    System.out.printf("TD: Add %d elements and pop %d elements: falied!\n",elmPush, elmPop);
                }
        }else{
            if(testStack.peek() == ' '){
                    System.out.printf("TD: Add %d elements and pop %d elements: succeed!\n",elmPush, elmPop);
            }else{
                    System.out.printf("TD: Add %d elements and pop %d elements: falied!\n",elmPush, elmPop);
            }
        }
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
               
        int [] numberElmToPush = {0,1,2,3,7}; // Array with the number of elements on the stack 
        int [] numberElmToPop = {1,1,1,4,1}; // Array with number of elements to pop
        int numberTestCases = numberElmToPush.length; 
        //for (int numberElm : numberElmList){
        for(int testCase=0; testCase<numberTestCases; testCase++){
            
            // Arrange
            for(int i=1; i<=numberElmToPush[testCase]; i++){
                
                inputChar = (char)(i + 'a');
                testStack.push(inputChar);
            }
            
            // Act
            //System.out.printf("numberElmToPop = %d\n",numberElmToPop[3] );
            for(int i=0; i<numberElmToPop[testCase]-1; i++){

                testStack.pop();
            }
            popValue = testStack.pop();
        
            // Assert
            assert_push(numberElmToPush[testCase], numberElmToPop[testCase], popValue, testStack);
            
        }
        
    }
}
