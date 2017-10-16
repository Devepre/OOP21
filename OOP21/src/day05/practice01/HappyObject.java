package day05.practice01;

public class HappyObject extends MoodyObject {
	
	@Override
	protected String getMood() {
		return "happy";
	}

	public void laugh() {
		System.out.println("hahaha");
	}
}
