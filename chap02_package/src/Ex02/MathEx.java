package Ex02;

public class MathEx {
    public static void main(String[] args) {
        double a = Math.PI; // 변수 a를 선언하고 값 3.14를 저장

        System.out.println(Math.PI); // 원주율 상수 출력: 3.141592653589793
        System.out.println(Math.ceil(a)); // ceil(올림): 3.14 → 4.0
        System.out.println(Math.floor(a)); // floor(내림): 3.14 → 3.0
        System.out.println(Math.sqrt(9)); // 제곱근: √9 = 3.0
        System.out.println(Math.exp(2)); // e의 2승 ≈ 7.389
        System.out.println(Math.round(3.14)); // 반올림: 3.14 → 3

        // [1, 45] 사이의 정수형 난수 5개 발생
        System.out.print("이번주 행운의 번호는 ");
        for(int i = 0; i < 5; i++)
            System.out.print((int)(Math.random() * 45 + 1) + " ");
            // Math.random(): 0.0 이상 1.0 미만의 실수
            // * 45 → 0.0 이상 45.0 미만
            // + 1 → 1.0 이상 46.0 미만
            // (int) → 1 이상 45 이하의 정수로 변환
    }
}
