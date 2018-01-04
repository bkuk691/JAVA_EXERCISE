package icehs.science.chapter04;

public class SalaryTest {
	public static void main(String[] args) {
		int monthSalary  = 1000000;
		int bonus = monthSalary * 20/100 * 4;
		int yearSalary  = monthSalary * 12;
		int bonusTax = bonus * 55 /1000;
		int yearSalaryTax = yearSalary * 10/100;
		int totalSalary = yearSalary + bonus - bonusTax -yearSalaryTax;
				
		System.out.println("연봉 : " +  yearSalary + ", 세후 연봉  : " +(yearSalary-yearSalaryTax));
		System.out.println("보너스 : " + bonus +", 세후 보너스 : "+(bonus-bonusTax));
		System.out.println("지급액 : " + totalSalary);
	}
}
