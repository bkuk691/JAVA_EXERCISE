package icehs.science.chapter04;

public class CalculatorTest {

	public static void main(String[] args) {
		int number1 = 20;
		int number2 = 7;
		int addResult = number1 + number2;
		int subResult = number1 - number2;
		int mulResult = number1 * number2;
		int divResult = number1 / number2;
		int remResult = number1 % number2;
		
		
		System.out.println("µ¡¼À °á°ú : " + (number1 +  number2));
		System.out.println("µ¡¼À °á°ú : " + addResult);
		System.out.println("»¬¼À °á°ú : " + subResult);
		System.out.println("°ö¼À °á°ú : " + mulResult);
		System.out.println("³ª´°¼À °á°ú : " + divResult);
		System.out.println("³ª¸ÓÁö ¿¬»ê °á°ú : " + remResult);
		

	}

}
