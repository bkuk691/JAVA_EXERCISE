package icehs.science.chapter08;

public class StudentArrayTest {

	public static void main(String[] args) {
		Student[] students = new Student[3];
		
		students[0] = new Student("������","STUOOO1","010-1234-5678");
		students[1] = new Student("�̼���","STUOOO2","010-9234-8678");
		students[2] = new Student("������","STUOOO3","010-5234-7678");
		
		for(int i = 0 ; i < students.length ; i++) {
			System.out.println(students[i].getName() +
					"(" +  students[i].getId() + 
					")/ ��ȭ��ȣ : " + students[i].getPhone());
		}

	}

}
