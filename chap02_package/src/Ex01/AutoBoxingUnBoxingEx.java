package Ex01;

public class AutoBoxingUnBoxingEx {  // AutoBoxingUnBoxingEx 클래스 정의
    public static void main(String[] args) {  // main 메소드 시작
        int n = 10;  // 기본형 int 변수 n 선언 및 초기화
        Integer intObject = n;  // auto boxing: 기본형 int를 Integer 객체로 자동 변환
        
        System.out.println("intObject = " + intObject);  // Integer 객체를 출력 (10)
        
        int m = intObject + 10;  // auto unboxing: Integer 객체를 기본형 int로 자동 변환 후 계산
        System.out.println("m = " + m);  // 계산된 값 20을 출력
    }
}
