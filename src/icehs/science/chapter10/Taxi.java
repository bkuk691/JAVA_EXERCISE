package icehs.science.chapter10;

public class Taxi extends Car {
	private int maxNum;

	public void setMaxNum(int maxNum) {
		this.maxNum = maxNum;
	}

	public int getMaxNum() {
		return maxNum;
	}
	
	@Override
	public void go(int distance) {
		System.out.println("택시를 타고 " + distance +"km 이동합니다.");
		System.out.println("연료 : " + this.getOilSize());
	}
	
	public void wash() {
		System.out.println("택시 : 세차합니다.");
	}
}
