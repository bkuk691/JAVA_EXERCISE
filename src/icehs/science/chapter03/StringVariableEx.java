package icehs.science.chapter03;

public class StringVariableEx {

	public static void main(String[] args) {
		String name = "홍길동";
		String mathScore = "95";
		int intMathScore = Integer.parseInt(mathScore);
		int engScore = 82;
		
		System.out.println("이름 : " + name);
		System.out.println("수학점수 : " + intMathScore);
		System.out.println("영어점수 : " + engScore);
		
		System.out.println("합계점수 : " + (intMathScore + engScore));
		System.out.println(intMathScore + engScore +"점");

	}

}
