package Ex1;

public class ColorPoint extends Point { 	//Point를 상속한 ColorPoint 클래스
	
	private String color; 		//색
	public void setColor(String color) {
		this.color = color;		//color의 값을 color에 저장
	
	}

	public void showColorPoint() {		//색 좌표를 보여 주는 메소드
		System.out.print(color);
		showPoint();		//Point에서 showPoint 호출
	}
}
