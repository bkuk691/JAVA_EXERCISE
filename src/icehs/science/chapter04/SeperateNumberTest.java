package icehs.science.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		int number= 456;
		int hundNo = number / 100;
		int decNo = (number % 100) / 10;
		int loneNo = (number % 100) % 10;
		
		System.out.println("���� �ڸ� �� : " + hundNo);
		System.out.println("���� �ڸ� �� : " + decNo);
		System.out.println("���� �ڸ� �� : " + loneNo);
		

	}

}
