package icehs.science.chapter03;

public class StringVariableEx {

	public static void main(String[] args) {
		String name = "ȫ�浿";
		String mathScore = "95";
		int intMathScore = Integer.parseInt(mathScore);
		int engScore = 82;
		
		System.out.println("�̸� : " + name);
		System.out.println("�������� : " + intMathScore);
		System.out.println("�������� : " + engScore);
		
		System.out.println("�հ����� : " + (intMathScore + engScore));
		System.out.println(intMathScore + engScore +"��");

	}

}
