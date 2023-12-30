package DesignPattern.AbstractFactoryDesign;

import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		int res =Test.bracketMatch("({()}}]");
		System.out.println(res);
	}

	public static int bracketMatch(String text) {
		// your code goes here
		Stack<Character> stack = new Stack<>();
		int count=0;
		for (char c : text.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if (c == ')' || c == '}' || c == ']') {
				if (stack.isEmpty()) {
					count++;
				}
				else{
					char top = stack.peek();
					if ((c == ')' && top == '(') ||
							    (c == '}' && top == '{') ||
							    (c == ']' && top == '[')) {
						stack.pop();
					}else{
						count++;
					}
				}

			}
		}

		return count+stack.size();


	}
}