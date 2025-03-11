package Ex1;

public class Point {
	private int x, y;	//점 x와 y 변수 지정
	
	public void set(int x, int y) {
		this.x = x; 	//x에 x값을 저장
		this.y = y;		//y에 y값을 저장
	}
	
	public void showPoint() {	//좌표를 보여 주는 메서드
		System.out.println("(" + x + "," + y + ")"); 	//출력: (x, y)
	}
}
