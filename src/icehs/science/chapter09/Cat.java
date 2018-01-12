package icehs.science.chapter09;

public class Cat extends Animal {
	
	public Cat(int age, String kind, String name) {
		super(age,kind);
		this.name = name;
	}
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void play() {
		System.out.println("∏∫Ù≥Ó¿Ã∞° ¡¡æ∆ø‰");
	}
	
	public void hunt() {
		System.out.println("¡„∏¶ ¿‚¿ª∞≈æﬂ");
	}
}
