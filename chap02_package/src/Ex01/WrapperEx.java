package Ex01;

public class WrapperEx {  // WrapperEx 클래스 정의
    public static void main(String[] args) {  // main 메소드 시작
        System.out.println(Character.toLowerCase('A'));  // 'A'를 소문자로 변환하여 출력 ('a')

        char c1='4', c2='F';  // 문자 변수 c1과 c2 선언 및 초기화
        
        if(Character.isDigit(c1))  // 문자 c1이 숫자인지 확인
            System.out.println(c1 + "는 숫자");  // true: c1은 숫자이므로 출력 ('4는 숫자')
        
        if(Character.isAlphabetic(c2))  // 문자 c2가 영문자인지 확인
            System.out.println(c2 + "는 영문자");  // true: c2는 영문자이므로 출력 ('F는 영문자')
        
        System.out.println(Integer.parseInt("-123"));  // 문자열 "-123"을 정수로 변환하여 출력 (-123)
        
        System.out.println(Integer.toHexString(28));  // 정수 28을 16진수 문자열로 변환하여 출력 ("1c")
        
        System.out.println(Integer.toBinaryString(28));  // 정수 28을 2진수 문자열로 변환하여 출력 ("11100")
        
        System.out.println(Integer.bitCount(28));  // 28의 2진수 표현에서 1의 개수를 출력 (3)
        
        Double d = Double.valueOf(3.14);  // 3.14를 Double 객체로 변환
        
        System.out.println(d.toString());  // Double을 문자열로 변환하여 출력 ("3.14")
        System.out.println(Double.parseDouble("3.14"));  // 문자열 "3.14"를 실수로 변환하여 출력 (3.14)
        
        boolean b = (4>3);  // b는 true (4가 3보다 크므로)
        
        System.out.println(Boolean.toString(b));  // true를 문자열로 변환하여 출력 ("true")
        System.out.println(Boolean.parseBoolean("false"));  // 문자열 "false"를 boolean 값으로 변환하여 출력 (false)
    }
}
