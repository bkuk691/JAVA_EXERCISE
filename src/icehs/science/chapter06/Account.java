package icehs.science.chapter06;

public class Account {
	String accName;
	String accNo;
	int balance; //잔액
	
	void deposit(int money) {
		System.out.println(money +"원을 입금합니다.");
		if(money <0) {
			System.out.println("[에러] 금액은 음수를 입력할 수 없습니다.");
		}else {
			balance += money;
		}
		System.out.println("잔액 : " + balance +"원");
	}
	
	void withdraw(int money) {
		System.out.println(money +"원을 출금합니다.");
		if(money < 0) {
			System.out.println("[에러] 금액은 음수를 입력할 수 없습니다.");
		}else if(money > balance) {
			System.out.println("[에러] 잔액이 부족합니다.");
		}else {
			balance -= money;
		}		
		System.out.println("잔액 : " + balance +"원");
	}
	
	void printAccountInfo() {
		System.out.println("계좌  " + accNo + "(예금주 : " + accName +")");
		System.out.println("잔액 : " + balance + "원");
	}
}
