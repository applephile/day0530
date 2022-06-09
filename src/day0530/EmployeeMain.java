package day0530;

class Employee {
	private String name;
	private double salary;
	
	private static int count = 0;
	
	Employee(){}
	Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
		count++;
	}
	
	//객체가 소멸될 때 호출되는 메서드
	protected void finalize() {
		count--;
	}
	
	public static int getCount() {
		return count;
	}
}

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("김그린", 15000);
		Employee e2 = new Employee("이자바", 20000);
		Employee e3 = new Employee("김타툼", 28000);
		
		e1 = null;
		System.gc(); //가비지 컬렉터 호출
		
		System.out.println("현재 직원 수 : " + Employee.getCount());
	}

}
