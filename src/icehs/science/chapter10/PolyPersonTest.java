package icehs.science.chapter10;

public class PolyPersonTest {

	public static void main(String[] args) {
		Person[] p1 = {new Person(), new Student("홍길동","123", "컴공과"),new Teacher("전우치","124","Java")};
		
	/*	Person p1 = new Person();
		Person s1 =  new Student("홍길동","123", "컴공과");
		Person t1 = new Teacher("전우치","124","Java");*/
		
		p1[0].sleep();
		p1[1].sleep();
		p1[2].sleep();

		p1[0].eat();
		p1[1].eat();
		p1[2].eat();
		
		if( p1[1] instanceof Student) {
			Student s = (Student)p1[1];
			s.study();
		}else if(p1[1] instanceof Teacher) {
			Teacher t = (Teacher)p1[1];
			t.teach();
		}
		
		((Student)p1[1]).study();
		((Teacher)p1[2]).teach();
	}

}
