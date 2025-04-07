package Ex02;
import java.util.StringTokenizer; // 문자열을 토큰(단어) 단위로 분리해주는 클래스 import

public class StringTokenizerEx {
	public static void main(String[] args) {
		
		// "/"를 구분자로 하여 문자열을 분리하는 StringTokenizer 객체 생성
		StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/");

		// hasMoreTokens(): 다음 토큰이 존재하는 동안 반복
		while (st.hasMoreTokens())
			// nextToken(): 다음 토큰을 반환
			System.out.println(st.nextToken());
			// 출력 결과:
			// 홍길동
			// 장화
			// 홍련
			// 콩쥐
			// 팥쥐
	}
}
