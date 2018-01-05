package icehs.science.chapter05;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		int stuNo = 0;
		int sumScore = 0;
		double avgScore = 0.0;
		
		System.out.print("반의 학생수는?");
		stuNo = getUserInput();
		for(int i = 0 ; i < stuNo ; i++) {
			System.out.print((i+1)+"번 학생 점수  : ");
			sumScore += getUserInput();
		}
		avgScore = (double)sumScore/stuNo;
		//int a = getUserInput();
		//for구문을 작성합니다.  성적 합계를 구하시오.
		//합계를 이용해서 평균을 구하시오.
		System.out.println("======================");
		System.out.println(stuNo + "명의 총점 : " + sumScore);
		System.out.println(stuNo + "명의 평균 : " + avgScore);
		System.out.println("======================");

	}
	public static int getUserInput() {      
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }
	

}
