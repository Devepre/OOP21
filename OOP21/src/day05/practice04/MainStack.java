package day05.practice04;

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

	}

}
