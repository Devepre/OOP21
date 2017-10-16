package day05.practice04;

import java.util.ArrayList;

public class MyStack {
	private ArrayList<Object> list;

	public MyStack() {
		super();
		this.list = new ArrayList<>();
	}

	public boolean empty() {
		return list.isEmpty();
	}

	public Object peek() {
		if (!empty()) {
			return list.get(0);
		}
		return null;
	}

	public Object pop() {
		if (!empty()) {
			return list.remove(0);
		}
		return null;
	}
	
	public Object push(Object item) {
		list.add(0, item);
		return item;
	}
	
	public int search (Object object) {
		int index = list.indexOf(object);
		if (index != -1) {
			return index++;
		}
		return -1;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " data: " + list + "";
	}

}
