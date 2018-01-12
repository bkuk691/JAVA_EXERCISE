package icehs.science.chapter10.animals;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal1 = new Bird("독수리", 3, "바위산 등");
		System.out.println(animal1.getKind() + "(" + animal1.getAge() + "살) : " +  ((Bird)animal1).getHabitat());
		((Bird)animal1).spreadWings();
		((Bird)animal1).fly();

	}

}
