package qeustion3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal[] aniArr = new Animal[3];
		int index;
		Dog d;
		
		aniArr[0] = new Bird();
		aniArr[1] = new Fish();
		aniArr[2] = new Dog();
		
		for(int i = 0; i < aniArr.length; i++) {
			aniArr[i].move();
		}
		
		 if (aniArr[2] instanceof Dog) {
	            d = (Dog) aniArr[2];
	            d.bark();
	        }
	}
	
}
