package Ex01;

class Rect {  // Rect 클래스 정의
    private int width;  // 직사각형의 너비
    private int height;  // 직사각형의 높이
    
    public Rect(int width, int height) {  // 생성자: 너비와 높이를 받아서 설정
        this.width = width;
        this.height = height;
    }
    
    public boolean equals(Object obj) {  // equals 메소드 오버라이드: 두 Rect 객체 비교
        Rect p = (Rect)obj;  // Object 타입을 Rect 타입으로 변환
        
        if (width*height == p.width*p.height)  // 면적이 같으면 동일한 객체로 간주
            return true;  // 면적이 같으면 true 반환
        else
            return false;  // 면적이 다르면 false 반환
    }
}

public class EqualsEx2 {  // EqualsEx2 클래스 정의
    public static void main(String[] args) {  // main 메소드 시작
        Rect a = new Rect(2,3);  // Rect 객체 a 생성
        Rect b = new Rect(3,2);  // Rect 객체 b 생성
        Rect c = new Rect(3,4);  // Rect 객체 c 생성
        
        if(a.equals(b))  // a와 b의 면적이 동일한지 비교
            System.out.println("a is equal to b");  // true: a와 b는 면적이 같음
        if(a.equals(c))  // a와 c의 면적이 동일한지 비교
            System.out.println("a is equal to c");  // false: a와 c는 면적이 다름
        if(b.equals(c))  // b와 c의 면적이 동일한지 비교
            System.out.println("b is equal to c");  // false: b와 c는 면적이 다름
    }
}
