package Ex01;

public class StringEx {  // StringEx 클래스 정의
    public static void main(String[] args) {  // main 메소드 시작
        String a = new String(" C#");  // 문자열 a 선언 및 초기화 (앞에 공백 포함)
        String b = new String(",C++ ");  // 문자열 b 선언 및 초기화 (뒤에 공백 포함)
        
        System.out.println(a + "의 길이는 " + a.length());  // a의 길이 출력 (공백 포함 길이)
        System.out.println(a.contains("#"));  // a에 "#" 문자가 포함되어 있는지 확인하여 true 반환
        
        a = a.concat(b);  // a와 b를 연결하여 새로운 문자열로 저장
        System.out.println(a);  // " C# ,C++ " 출력
        
        a = a.trim();  // 문자열 앞뒤의 공백을 제거
        System.out.println(a);  // "C# ,C++" 출력
        
        a = a.replace("C#","Java");  // "C#"을 "Java"로 교체
        System.out.println(a);  // "Java ,C++" 출력
        
        String s[] = a.split(",");  // 문자열을 "," 기준으로 분리하여 배열에 저장
        
        for (int i = 0; i < s.length; i++)  // 분리된 문자열 배열 출력
            System.out.println("분리된 문자열 " + i + ": " + s[i]);  // "분리된 문자열 0: Java" 및 "분리된 문자열 1: C++" 출력
        
        a = a.substring(5);  // 인덱스 5부터 끝까지 자른 문자열 리턴
        System.out.println(a);  // "C++" 출력
         
        char c = a.charAt(2);  // 인덱스 2의 문자 리턴
        System.out.println(c);  // '+' 출력
    }
}
