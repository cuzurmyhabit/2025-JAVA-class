package Ex2;

public class Person {
	
	private int weight;	//private: 다른 모든 클래스 접근 불허
	int age; 	//디폴트 값은 클래스 모든 접근 허용
	protected int height;	//protected:값은 패키지 내 모든 클래스 접근 허용
	public String name; 	//public: 모든 클래스에 접근 허용
	
	
	public void setWeight (int weight) { 	//몸무게 설정 메서
		this.weight = weight; 		//weight에 지정된 weight값 넣기
	}
	
	public int getWeight() {	//몸무게 값을 받는 메서드
		return weight;		//몸무게 값 반환
	}
}

