package qeustion4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[20];
        int count = 0;

        while (count < 20) {
            System.out.print("학생의 수준을 입력하세요(학부생=1, 대학원생=2): ");
            int level = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            System.out.print("학생의 이름을 입력하세요: ");
            String name = scanner.nextLine();

            System.out.print("학생의 점수를 입력하세요: ");
            int score = scanner.nextInt();

            Student student;
            if (level == 1) {
                student = new UndergraduateStudent(name);
            } else {
                student = new GraduateStudent(name);
            }
            student.setScore(score);
            student.computeGrade();
            students[count] = student;
            count++;

            System.out.print("처리할 학생들이 더 있습니까?(예 혹은 아니오): ");
            String more = scanner.next();
            if (more.equalsIgnoreCase("아니오")) {
                break;
            }
        }

        System.out.println("\n학생 성적");
        System.out.println("소속\t이름\t점수\t학점");
        for (int i = 0; i < count; i++) {
            String affiliation = (students[i] instanceof UndergraduateStudent) ? "학부" : "대학원";
            System.out.println(affiliation + "\t" + students[i].getName() + "\t" + students[i].getScore() + "\t" + students[i].getGrade());
        }
    }
}
