package Ex01;  

class Point3 {  // Point3 클래스 정의
    private int x, y;  // x, y 좌표를 저장할 변수 선언
    public Point3(int x, int y) {  // 생성자: x, y 값을 받아서 변수에 할당
        this.x = x; this.y = y;  // 매개변수로 받은 x, y 값을 클래스 변수에 할당
    }
    
    public boolean equals(Object obj) {  // equals 메소드 오버라이드: 객체 비교
        Point3 p = (Point3)obj;  // Object 타입을 Point3 타입으로 변환
        if(x == p.x && y == p.y) return true;  // x, y 값이 동일하면 true 반환
        else return false;  // 그렇지 않으면 false 반환
    }
}

public class EqualsEx {  // EqualsEx 클래스 정의
    public static void main(String[] args) {  // main 메소드 시작
        Point a = new Point(2,3);  // Point 객체 a 생성
        Point b = new Point(2,3);  // Point 객체 b 생성
        Point c = new Point(3,4);  // Point 객체 c 생성
        
        if(a == b)  // a와 b가 동일한 객체인지 비교 (참조 비교)
            System.out.println("a==b");  // false: a와 b는 다른 객체 참조
        
        if(a.equals(b))  // a와 b가 내용이 동일한 객체인지 비교 (값 비교)
            System.out.println("a is equal to b");  // true: a와 b의 값이 동일
        
        if(a.equals(c))  // a와 c가 내용이 동일한 객체인지 비교 (값 비교)
            System.out.println("a is equal to c");  // false: a와 c의 값이 다름
    }
}
