package day05.practice02;

public abstract class MoodyObject {
	public void querryMood() {
		System.out.println("I feel " + getMood() + " today!");
	}
	
	protected abstract String getMood();

}
