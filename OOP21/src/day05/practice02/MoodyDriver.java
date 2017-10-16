package day05.practice02;

public class MoodyDriver {

	public static void main(String[] args) {
		SadObject sadObject = new SadObject();
		HappyObject happyObject = new HappyObject();
		
		System.out.println("How does the sad object feel today?");
		sadObject.querryMood();
		sadObject.cry();
		System.out.println();
		
		System.out.println("How does the happy object feel today?");
		happyObject.querryMood();
		happyObject.laugh();
		System.out.println();
	}

}
