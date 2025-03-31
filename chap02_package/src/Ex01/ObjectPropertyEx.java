package Ex01;

class Point {  // Point 클래스 정의
    private int x, y;  // x, y 좌표 변수
    
    public Point(int x, int y) {  // 생성자: x, y 값을 받아서 초기화
        this.x = x;
        this.y = y;
    }
}

public class ObjectPropertyEx {  // ObjectPropertyEx 클래스 정의
    public static void print(Object obj) {  // 객체의 다양한 속성을 출력하는 print 메소드 정의
    	
        System.out.println(obj.getClass().getName());  // 객체의 클래스 이름을 출력
        
        System.out.println(obj.hashCode());  // 객체의 해시 코드 값을 출력
        
        System.out.println(obj.toString());  // 객체를 문자열로 변환하여 출력
        
        System.out.println(obj);  // 객체를 출력 (toString()이 자동 호출)
    }
    
    public static void main(String [] args) {  // main 메소드 시작
        Point p = new Point(2, 3);  // Point 객체 p 생성 (좌표: (2, 3))
        print(p);  // print 메소드를 호출하여 객체 p의 속성 출력
    }
}
