package icehs.science.chapter06;

public class Car {
	int oilAmount;
	double driveDistance;
	
	void addOil(int newOil) {
		System.out.println("�ֹ��� " + newOil +"L �����մϴ�.");
		oilAmount += newOil;
	}
	
	void driveCar(String start, String end, double distance) {
		driveDistance += distance;
		oilAmount = (int)(oilAmount - distance/20);
		System.out.println(start + "���� " + end +"���� " + distance +"km �����Ͽ����ϴ�.");
	}
	
	double calculateDrivingDistance() {
		double distance = oilAmount * 20;
		return distance;
	}
	void carInfo() {
		System.out.println("[ICE ī~] ���� �⸧ �� : " + oilAmount + "L, ������Ÿ� : " + driveDistance +"km");
	}
	
	
}