package Ex5;

public class MethodOverridingEx {
	
	static void paint(Shape p) {
		p.draw(); 	//p가 가리키는 객체 내에 오버라이딩 된 draw 호출
					//동적 바인딩
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Line line = new Line();
		
		paint(line);			//Line
		paint(new Shape());		//Shape
		paint(new Line());		//Line
		paint(new Rect());		//Rect
		paint(new Circle());	//Circle

	}

}
