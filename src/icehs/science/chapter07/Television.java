package icehs.science.chapter07;

public class Television {
	String name;
	int price;
	String description;
	
	public Television(String name,  String description, int price) {
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public Television(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void printTelevisionInfo() {
		if(description == null) {
			System.out.println(name + " : " + price);
		}else {
			System.out.println(name + " ( " + description +") : "+ price);
		}
	}
}
