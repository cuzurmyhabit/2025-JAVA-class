package Ex5;

class Shape { 	//super class
	public Shape next;
	public Shape() {next = null;}
	
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape{ 	//Shape 상속 받음
	public void draw() {	//메서드 오버라이딩
		System.out.println("Line");
	}
}

class Rect extends Shape{ 	//Shape 상속 받음
	public void draw() {	 //메서드 오버라이딩
		System.out.println("Rect");
	}
}


class Circle extends Shape{ //Shape 상속 받음
	public void draw() {	//메서드 오버라이딩
		System.out.println("Circle");
	}
}
