package icehs.science.chapter07;



import java.util.Scanner;

import icehs.science.chapter06.Building;
import icehs.science.chapter06.Car;

public class BuildingTest {

	public static void main(String[] args) {
		Building b1 = new Building();
		Car c1 = new Car();
	}
	
	public static int getUserInput() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt() ;
		return input;
	}

}
