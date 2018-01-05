package icehs.science.chapter05;

public class NumberCheckTest {

	public static void main(String[] args) {
		int number1 = 4;
		int number2 = -3;
		int result = number1 * number2;
		//if ~ else if ~ else if ~ else
		if(result >= 100) {
			System.out.println(number1 + " * " + number2 + " : 세자리 수입니다.");
		}else if(result >= 10) {
			System.out.println(number1 + " * " + number2 + " : 두자리 수입니다.");
		}else if(result >= 0) {
			System.out.println(number1 + " * " + number2 + " : 한자리 수입니다.");
		}else {
			System.out.println(number1 + " * " + number2 + " : 음수는 확인하지 않습니다.");
		}

	}

}
