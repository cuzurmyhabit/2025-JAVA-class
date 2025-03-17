package qeustion2;

public class Car extends Vehicle {
	
	int displacement;
	
	public Car(String modelName, int price, int displacement) {
		super(modelName, price);
		
		this.displacement = displacement;
	}
	
	public Double duty() {
		if (displacement >= 3000) {
            return price * 0.05 / 10000;
        } else if (displacement >= 1500) {
            return price * 0.03 / 10000;
        } else {
            return price * 0.01 / 10000;
        }
	}
	
	public void print() {
		System.out.println("모델명 = " + modelName + ", 가격 = " + (price / 100) + "만원, 배기량 = " + displacement + ", 세금 = " + duty());
	}
}

