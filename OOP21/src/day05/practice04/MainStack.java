package day05.practice04;

import java.util.Stack;

public class MainStack {

	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		myStack.push(5);
		myStack.push("Hello");
		myStack.push(null);
		System.out.println(myStack);

		System.out.println(myStack.pop());
		System.out.println(myStack);

		System.out.println(myStack.peek());
		System.out.println(myStack);

		myStack.push(0.2);
		myStack.push("Hello");
		myStack.push(45);
		System.out.println(myStack);

		System.out.println(myStack.search("Hello"));
		
		//using methods inherited from Vector (which are not supposed to exist for stack)
		Stack<Object> stack = new Stack<>();
		stack.push(5);
		stack.push("Hi");
		Object obj = stack.get(1);
		System.out.println(stack);
		System.out.println(obj);
		stack.remove(1);
		System.out.println(stack);

	}

}
