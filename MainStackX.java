/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author erkoc
 */
public class MainStackX {
    public static void main(String[] args) throws InterruptedException {
        
        StackX newStack = new StackX(5);
        
        newStack.push(10);
        newStack.push(20);
        newStack.push(30);
        newStack.push(40);
        newStack.push(50);
        
        while(!newStack.isEmpty()){
            long value = newStack.pop();
            System.out.println(value);
            Thread.sleep(1000);
        }
    }
    
}
