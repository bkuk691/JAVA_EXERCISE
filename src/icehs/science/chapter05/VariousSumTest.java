package icehs.science.chapter05;

public class VariousSumTest {

	public static void main(String[] args) {
		int totalSum = 0; //��ü �հ�
		int oddSum = 0;  //Ȧ�� �հ�
		int evenSum = 0; //¦�� �հ�

		for(int i = 0 ; i <= 1000 ; i++) {
			if(i % 2 == 0) {
				evenSum += i;
			}else {
				oddSum += i;
			}
		}
		
		totalSum = oddSum + evenSum;
		System.out.println("1���� 1000������ �� : " + totalSum);
		System.out.println("1���� 1000���� Ȧ���� �� : " + oddSum);
		System.out.println("1���� 1000���� ¦���� �� : " + evenSum);

	}

}
