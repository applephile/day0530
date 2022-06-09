package day0530;

class Animal {
	String name;
	
	public void cry() {
		System.out.println(name + "가 소리를 낸다");
	}
}

class AnimalAction {
	public void action(Animal animal) {
		animal.cry();
		
		if(animal instanceof Dog) {
			((Dog) animal).run();
		} else if(animal instanceof Cat) {
			((Cat) animal).grooming();
		}
	}
}

class Dog extends Animal {
	@Override //어노테이션
	public void cry() {
		// TODO Auto-generated method stub
		super.cry();
		System.out.println("왈왈");
	}
	
	public void run() {
		
		System.out.println(name + "가 뛴다");
	}

}

class Cat extends Animal {
	
	
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		super.cry();
		System.out.println("야옹");
	}

	public void grooming() {
		System.out.println("그루밍");
	}
}

public class AnimalMain {

	public static void main(String[] args) {
		
		AnimalAction a = new AnimalAction();
		
		Dog d = new Dog();
		d.name = "강아지";
		
		Cat c = new Cat();
		c.name = "고양이";
		
		a.action(d);
		a.action(c);
	}

}
