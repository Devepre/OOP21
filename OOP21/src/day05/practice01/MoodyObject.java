package day05.practice01;

public class MoodyObject {
	public void querryMood() {
		System.out.println("I feel " + getMood() + " today!");
	}
	
	protected String getMood() {
		return "moody";
	}
}
