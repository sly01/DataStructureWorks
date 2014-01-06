/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author erkoc
 */
public class BracketChecker {

    private String input;
// input string
//--------------------------------------------------------------

    public BracketChecker(String in) // constructor
    {
        input = in;
    }
//--------------------------------------------------------------

 

    public void check() {
        int stackSize = input.length();
// get max stack size
        StackX theStack = new StackX(stackSize); // make stack
        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    theStack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if (!theStack.isEmpty()) // if stack not empty,
                    {
                        char chx = (char) theStack.pop(); // pop and check
                        if ((ch == '}' && chx != '{' || (ch == ']' && chx != '[') || (ch == ')' && chx != '('))) {
                            System.out.println("Error: " + ch + " at " + j);
                        }
                    } else // prematurely empty
                    {
                        System.out.println("Error: " + ch + " at" + j);
                    }
                    break;
                default:
// no action on other characters
                    break;
            } // end switch
        } // end for
// at this point, all characters have been processed
        if (!theStack.isEmpty()) {
            System.out.println("Error: missing right delimiter");
        }
    }
}
