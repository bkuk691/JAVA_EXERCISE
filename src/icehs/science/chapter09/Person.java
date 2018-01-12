package icehs.science.chapter09;

public abstract class Person {
	private String name;
	private String phone;
	
	public Person() {
		this.name = "����";
		this.phone = "����ó����";
	}
	
	public Person(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	public abstract void watch();
	
	public void eat() {
		System.out.println("����� ���� �Դ�.");
	}
	
	public void sleep() {
		System.out.println("���ڴ�");
	}
}
