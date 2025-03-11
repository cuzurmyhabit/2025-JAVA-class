package Ex3;

public class ColorPoint2 extends Point2{ 	//point2를 상속 받은 ColorPoint class
	
	private String color; 	//색 지정 변수
	
	public ColorPoint2(int x, int y, String color) {
		super(x, y);	///point의 x y 호출
		this.color = color;		//지정된 color 값을 color에 저장
	}
	
	public void showColorPoint() {		//색 점의 좌표를 보여 주는 메소드
		System.out.print(color);
		showPoint();		//Point의 showPoint호출
	}
}
