package icehs.science.chapter06;

public class Car {
	int oilAmount;
	double driveDistance;
	
	void addOil(int newOil) {
		System.out.println("휘발유 " + newOil +"L 주유합니다.");
		oilAmount += newOil;
	}
	
	void driveCar(String start, String end, double distance) {
		driveDistance += distance;
		oilAmount = (int)(oilAmount - distance/20);
		System.out.println(start + "에서 " + end +"까지 " + distance +"km 주행하였습니다.");
	}
	
	double calculateDrivingDistance() {
		double distance = oilAmount * 20;
		return distance;
	}
	void carInfo() {
		System.out.println("[ICE 카~] 남은 기름 양 : " + oilAmount + "L, 총주행거리 : " + driveDistance +"km");
	}
	
	
}
