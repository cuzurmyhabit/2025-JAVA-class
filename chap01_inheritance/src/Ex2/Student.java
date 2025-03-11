package Ex2;

public class Student extends Person{

	public void set() { 	//학생의 값 설정
		age = 30;		//디폴트 값은 클래스 모든 접근 허용
		name = "홍길동"; //publc은 모든 클래스 접근 허용
		height = 175;	//protected는 값은 클래스 내 접근 허용
		//weight = 99;	//private는 접근 불가
		setWeight(99); 	//setWeight()메서드를 통하여 간접적으로 접근 가능
	}
}
