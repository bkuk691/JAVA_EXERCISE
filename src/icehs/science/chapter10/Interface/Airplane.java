package icehs.science.chapter10.Interface;

public class Airplane implements IFlyable {
	
	public void fly() {
		System.out.println("³¯¾Æ´Ù´Õ´Ï´Ù.");
	}
	
	public void landing() {
		System.out.println("Âø·úÇÕ´Ï´Ù.");
	}
}
