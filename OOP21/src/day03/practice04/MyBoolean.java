package day03.practice04;

public class MyBoolean {
	public static final Class TYPE = Boolean.TYPE;
	private boolean value;

	public MyBoolean() {
		super();
		value = false;
	}

	public MyBoolean(boolean value) {
		super();
		this.value = value;
	}

	public boolean booleanValue() {
		return value;
	}

	public void setBooleanValue(boolean value) {
		this.value = value;
	}

	public static boolean getBoolean(String name) {
		return Boolean.getBoolean(name);
	}

	public static MyBoolean valueOf(String s) {
		return new MyBoolean(Boolean.getBoolean(s));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (value ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyBoolean other = (MyBoolean) obj;
		if (value != other.value)
			return false;
		return true;
	}

	@Override
	public String toString() {
		if (value) {
			return "true";
		}
		return "false";

	}

}
