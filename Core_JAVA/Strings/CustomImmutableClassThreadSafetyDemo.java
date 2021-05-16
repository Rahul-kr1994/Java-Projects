package com.practice.EverythingAboutString;

public class CustomImmutableClassThreadSafetyDemo {

	private CustomImmutableClass customImmutableClass;

	public CustomImmutableClass getCustomImmutableClass() {
		return customImmutableClass;
	}

	public void setCustomImmutableClass(CustomImmutableClass customImmutableClass) {
		this.customImmutableClass = customImmutableClass;
	}

	public void add(int newValue) {
		this.customImmutableClass = this.customImmutableClass.modify(newValue);
	}
	
	public static void main(String[] args) {
		CustomImmutableClass t = new CustomImmutableClass(100);
		System.out.println(t.getI());
	}
}
