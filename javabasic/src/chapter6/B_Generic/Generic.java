package chapter6.B_Generic;

// 제너릭
// 다양한 타입을 다루는 메서드나 클래스에 컴파일 시 타입을 체크하는 기능
// 컴파일 시 타입을 체크하기 때문에 유연하게 개발을 할 수 있음

class GenericClass<D> {
	
	boolean status;
	String message;
	D data;
	
	static <D> GenericClass<D> getInstance(boolean status, String message, D data) {
		GenericClass<D> instance = new GenericClass<>();
		instance.status = status;
		instance.message = message;
		instance.data = data;
		
		return instance;
	}
	
}

public class Generic {

	public static void main(String[] args) {
		
		GenericClass<Integer> generic1 = new GenericClass<>();
		GenericClass<String> generic2 = new GenericClass<>();
		
//		generic1.data = "String";
		generic2.data = "String";
		
		GenericClass<?> generic3 = 
				GenericClass.getInstance(true, "message", "String");
		
	}

}
