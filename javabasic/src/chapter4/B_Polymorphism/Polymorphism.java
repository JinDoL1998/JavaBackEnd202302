package chapter4.B_Polymorphism;

/*
 * 다형성! 
 * 조상클래스 타입의 참조변수로 자손클래스의 인스턴스를 참조할 수 있도록 하는 것 
 * 참조변수의 형변환
 * 
 */

class SuperClass{
	
	int number1;
	int number2;

	public SuperClass(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
		
	}
	
	void method1() {}
	void method2() {}
	
}

class SubClass1 extends SuperClass{
	
	
	
	public SubClass1(int number1, int number2, int number3) {
		
		super(number1,number2);
		this.number3 = number3;
	}
	
	int number3;
	void number3() {}
}
class SubClass2 extends SuperClass{

	public SubClass2(int number1, int number2) {
		super(number1, number2);
		
	
	
	}

	void method1() {
		System.out.println("오버라이드");
	}
}


public class Polymorphism {

	public static void main(String[] args) {
		
		SuperClass superClass = new SuperClass(1,2);
		SubClass1 subClass1 = new SubClass1(11,22,33);
		SubClass2 subClass2 = new SubClass2(111,222);
		
//		자손 타입이 -> 조상타입(upcasting)자동형변환 가능
		SuperClass super1 = subClass1;
		SuperClass super2 = subClass2;
		
//		System.out.println(super1.number3); //넘3 못찍음 없음
		SubClass1 sub1 = (SubClass1)super1;
		System.out.println(subClass1.number3); 
//		참조변수의 형변환을 한다하더라도 인스턴스가 가지고 있는 데이터에는 아무런 영향을 미치지 않는다
//		단지 인스턴스의 사용범위를 조절하는 것 
		
//		슈퍼클래스가 서브클래스를 설명할 수 없음. 그래서 형변환을 해줘야함
//		조상타입 -> 자손타입(down casting) : 자동형변환 불가능
//		SubClass1 sub1 = (SubClass1)superClass;
//		SubClass2 sub2 = (SubClass2)superClass;
		
		
		super2.method1(); 
		//슈퍼클래스로 바꿔도 오바라이드 한 거는 자식 게 나옴? 실제 인스턴스값? 
				
	}

}
