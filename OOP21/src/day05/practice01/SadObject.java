package day05.practice01;

public class SadObject extends MoodyObject {

	@Override
	protected String getMood() {
		return "saddy";
	}
	
	public void cry() {
		System.out.println("boo hoo");
	}

}
