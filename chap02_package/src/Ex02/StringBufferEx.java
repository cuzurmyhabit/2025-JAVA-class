package Ex02;

public class StringBufferEx {
	public static void main(String[] args) {
		// 초기 문자열 "This"를 가진 StringBuffer 객체 생성
		StringBuffer sb = new StringBuffer("This");

		sb.append(" is pencil"); // 문자열 끝에 " is pencil" 추가 → "This is pencil"
		System.out.println(sb);

		sb.insert(7, " my"); // 7번째 인덱스에 " my" 삽입 → "This is my pencil"
		System.out.println(sb);

		sb.replace(8, 10, "your"); // 인덱스 8~10 ("my")을 "your"로 대체 → "This is your pencil"
		System.out.println(sb);

		sb.delete(8, 13); // 인덱스 8~13 ("your ") 삭제 → "This is pencil"
		System.out.println(sb);

		sb.setLength(4); // 문자열 길이를 4로 설정, 이후 문자들은 잘림 → "This"
		System.out.println(sb);
	}
}
