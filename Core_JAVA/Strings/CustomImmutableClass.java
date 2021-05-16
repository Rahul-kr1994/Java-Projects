package com.practice.EverythingAboutString;

public final class CustomImmutableClass {

	private int i=10;

	public CustomImmutableClass(int i) {
		this.i = i;
	}

	public int getI() {
		return i;
	}

	public CustomImmutableClass modify(int i) {
		if (this.i == i) {
			return this;
		} else {
			return new CustomImmutableClass(i);
		}
	}

	public static void main(String[] args) {
		CustomImmutableClass t1 = new CustomImmutableClass(10);
		CustomImmutableClass t2 = t1.modify(100);
		CustomImmutableClass t3 = t1.modify(10);
		System.out.println(t1 == t2);
		System.out.println(t1 == t3);
	}
}
