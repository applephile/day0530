package day0530;

class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
	
}

class Tv extends Product {
	Tv(){
		super(100);
	}
	
	public String toString() {
		return "Tv";
	}
}
class Computer extends Product {
	Computer(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}
class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액 부족");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		System.out.println(p + "를 구매했습니다.");
		
	}
}

public class Mart {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		
		Product p = new Tv();
		b.buy(p);
		
		System.out.println("현재 잔액 : " + b.money + "원");
		System.out.println("보너스 포인트 : " + b.bonusPoint + "점");
		
		Product p1 = new Computer();
		
		b.buy(p1);
		
		System.out.println("현재 잔액 : " + b.money + "원");
		System.out.println("보너스 포인트 : " + b.bonusPoint + "점");
		
	}

}
