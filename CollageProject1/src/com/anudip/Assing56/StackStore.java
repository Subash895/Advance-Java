package com.anudip.Assing56;
import java.util.Stack;
public class StackStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating a Stack of Integer type
        Stack<Integer> stack = new Stack<>();

        // Adding 10 elements
        stack.push(23);
        stack.push(33);
        stack.push(43);
        stack.push(53);
        stack.push(63);
        stack.push(73);
        stack.push(83);
        stack.push(93);
        stack.push(103);
        stack.push(113);

        System.out.println("Elements in stack: " + stack);

        // Removing 4 elements (LIFO - Last In First Out)
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("After removing 4 elements: " + stack);
    }

}
