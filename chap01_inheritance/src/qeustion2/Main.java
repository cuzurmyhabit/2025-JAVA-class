package qeustion2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Car[] cars = new Car[3];
	        cars[0] = new Car("벤츠", 40000000, 3500);
	        cars[1] = new Car("그랜져", 30000000, 2000);
	        cars[2] = new Car("아반테", 15000000, 1000);

	        for (int i = 0; i < cars.length; i++) {
	            cars[i].print();
	        }
	}

}
