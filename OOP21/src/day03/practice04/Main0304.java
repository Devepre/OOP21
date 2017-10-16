package day03.practice04;

public class Main0304 {

	public static void main(String[] args) {
		MyBoolean tree = new MyBoolean();
		System.out.println("Default value is: " + tree);
		tree.setBooleanValue(true);
		System.out.println("Setting to true. Valuse is " + tree);
		
		boolean regularTree = true;
		System.out.println("Comparing regular true with MyBoolean true: " + (regularTree == tree.booleanValue()));
		regularTree = false;
		System.out.println("Comparing regular false with MyBoolean true: " + (regularTree == tree.booleanValue()));
		
		System.out.println("Type is: " + tree.TYPE);

	}

}
