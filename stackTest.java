/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedliststack;

import java.util.Random;
/**
 *
 * @author ATESXB
 */

public class stackTest {
    
    
    
    public static Node makeStackEmpty(){
        return null;
    }
    
    public void addElements(){
        
    }
    
    
    public static void testPush(Node top){
        
        Menu testObj = new Menu();
        // *** Push to an empty stack ***
        // Arrange
        top = makeStackEmpty();
        Random r = new Random();
        char testValue = (char)(r.nextInt(26) + 'a'); // Random character from a-w
        
        // Act
        top = testObj.push(top,testValue);
        
        //Assert
        if(top.getValue() == testValue){
            System.out.println("TD: Push to an empty stack: succeed!");
        }else{
            System.out.println("TD: Push to an empty stack: failed!");
        }
    
    }
    

    public static void main(String[] args) {
        Node top = new Node(null);
        top.setValue('a');       
        
        testPush(top);
        
        
    }
    
}
