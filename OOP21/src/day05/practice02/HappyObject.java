package day05.practice02;

public class HappyObject extends MoodyObject {

	@Override
	protected String getMood() {
		return "happy";
	}

	public void laugh() {
		System.out.println("hahaha");
	}
}
