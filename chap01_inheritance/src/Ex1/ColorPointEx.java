package Ex1;

public class ColorPointEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p = new Point();	//Point 객체 생성
		p.set(1, 2);	//Point class에서 set() 호출 ->(x, y) 값 지정
		p.showPoint();	//showPoint 메서드 호출 -> 출
		
		ColorPoint cp = new ColorPoint(); //ColorPoint 객체 생성
		cp.set(3, 4); 	//ColorPoint의 set() 호출 -> x, y) 값 지정
		cp.setColor("red");		// ColorPoint의 setColor() 호출 -> color 값 지정
		cp.showColorPoint();	//showPoint 메서드 호출 -> 출력

	}

}
