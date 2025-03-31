package Ex01;

class Point2 {  // Point2 클래스 정의
    private int x, y;  // x, y 좌표 변수
    
    public Point2(int x, int y) {  // 생성자: x, y 값을 받아서 초기화
        this.x = x;
        this.y = y;
    }
    
    public String toString() {  // toString 메소드 오버라이드: 객체를 문자열로 변환
        return "Point(" + x + "," + y + ")";  // "Point(x, y)" 형식으로 반환
    }
}

public class ToStringEx {  // ToStringEx 클래스 정의
    public static void main(String [] args) {  // main 메소드 시작
        Point2 p = new Point2(2, 3);  // Point2 객체 p 생성 (좌표: (2, 3))
        
        System.out.println(p.toString());  // toString() 메소드를 명시적으로 호출하여 객체 출력 ("Point(2,3)")
        System.out.println(p);  // 객체 p가 출력될 때 자동으로 toString()이 호출되어 출력 ("Point(2,3)")
        System.out.println(p + "입니다.");  // p.toString()이 자동으로 호출되어 "Point(2,3)입니다." 출력
    }
}
