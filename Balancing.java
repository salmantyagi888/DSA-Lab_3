package com.sam;
import java.util.Scanner;
import java.util.Stack;

public class Balancing {
	
	public static void main(String [] args) {
		Scanner Scanner=new Scanner(System.in);
		System.out.println("Please enter the input String");
		String input= Scanner.next();
		isBalancing(input);
	}
	
	public static void isBalancing(String s) {
		Stack<Character> stack=new Stack<>();
		for(int i=0; i<s.length(); i++) {
			char c=s.charAt(i);
			if(c=='(' || c=='{' || c=='[') {
				stack.push(c);
			}
			else {
				if(stack.isEmpty()) {
					System.out.println("Not balance");
					return;
				}
				char top= stack.peek();
				if((top=='('&& c==')') || (top=='{' && c=='}') ||(top=='[' && c==']')) {
					stack.pop();
				}
			} 
		}
		if(stack.isEmpty()) {
			System.out.println("Balance");
		}else {
			System.out.println("Not Balance");
		}
	}

}
