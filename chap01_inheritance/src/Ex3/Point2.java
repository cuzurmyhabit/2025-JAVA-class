package Ex3;

class Point2 {
	private int x, y;	//x y 변수 생성
	
	public Point2() {
		this.x = this.y = 0;	//x y값 0으로 지정 초기화
	}
	
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() { 	//점을 보여 주는 메서드 -> 출력: (x, y)
		System.out.println("(" + x + "," + y + ")");
	}
}
