package icehs.science.chapter04;

public class OperatorTest {

	public static void main(String[] args) {
		int number = 64;
		
		System.out.println("짝수 입니까? : " + (number % 2 == 0));
		System.out.println("3의 배수 입니까? : " + (number % 3 == 0));
		System.out.println("2의 배수 이면서 7의 배수입니까? : " + ((number % 2 == 0) && (number % 7 ==0)));
		System.out.println("2의 배수 이거나 7의 배수입니까? : " + ((number % 2 == 0) || (number % 7 ==0)));
		

	}

}
