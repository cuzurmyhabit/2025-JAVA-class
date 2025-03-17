package Ex4;

class Person{}		//person class 생성
class Student extends Person{}		//person class를 상속받은 students 생성
class Researcher extends Person{}		//person class를 상속받은 researcher 생성
class Professor extends Researcher{}	//researcber class를 상속 받은 professor 생성

public class InstanceOfEx {

	static void print(Person p) {
		
		// p가 Person 타입의 인스턴스일 경우 "Person" 출력
		if(p instanceof Person)
			System.out.print("Person ");
		
		//p가 Students 타입의 인스턴스일 경우 Student " 출력
		if(p instanceof Student)
			System.out.print("Student ");
			
		// p가 Researcher 타입의 인스턴스일 경우 "Researcher" 출력
		if(p instanceof Researcher)
			System.out.print("Researcher ");
			
		// p가 Professer 타입의 인스턴스일 경우 "Professer" 출력
		if(p instanceof Professor)
			System.out.print("Professor ");
			
		//줄바꿈
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.print("new Student() ->\t"); 
		print(new Student()); 	//student 출력 -> person student
		
		System.out.print("new Researcher() ->\t"); 
		print(new Researcher());	//researcher 출력 -> person researcher (person이자 researcher)
		
		System.out.print("new Professor() ->\t"); 
		print(new Professor());		//professer 출력 ->person researcher professor (person이자 researcher이자 professor)
		
	}

}
