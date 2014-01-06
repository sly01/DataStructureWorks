/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author erkoc
 */
public class MainQueue {
    
    public static void main(String[] args) {
        Queue theQueue = new Queue(5);
        
        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);
        theQueue.insert(50);
    
      while(!theQueue.isEmpty()){
          long value = theQueue.remove();
          System.out.println(value);
      }
    
    }
    
}
