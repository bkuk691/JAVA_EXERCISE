package icehs.science.chapter10.Interface;

public class VehicleTest {

	public static void main(String[] args) {
		IFlyable  air = new Airplane();
		air.fly();
		((Airplane)air).landing();

	}

}
