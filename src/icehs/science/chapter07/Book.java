package icehs.science.chapter07;

public class Book {
	String title;
	String author;
	int price;
	
//	Book(){
//		
//	}
	
	Book(String author){
		this.author = author;
	}
	
	Book(String title, String author){
		this(author);
		this.author = author;
		
	}
	
	Book(String title, String author, int price){
		this(title,author);
		this.price = price;
	}
}
