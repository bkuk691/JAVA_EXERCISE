package icehs.science.chapter07;

public class TelevisionTest {

	public static void main(String[] args) {
		Television infinia = new Television("INFINIA", 1500000);
		infinia.printTelevisionInfo();
		
		Television xcanvas = new Television("XCANVAS","LCD TV", 1000000);
		xcanvas.printTelevisionInfo();
		
		Television cinema = new Television("CINEMA","3D TV", 2000000);
		cinema.printTelevisionInfo();
		
		int totalPrice = infinia.price + xcanvas.price + cinema.price;
		System.out.println("가격의 합 : " + totalPrice);
		

	}

}
