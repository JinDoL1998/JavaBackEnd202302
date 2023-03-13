package chapter5.A_ExceptionHandling;

import java.util.Scanner;

// 예외
// 오류 중 개발자가 예측해서 제어할 수 있는 오류
// 컴파일 및 로직상의 문제는 없지만 사용자의 입력 혹은 타 프로그램에 결과에서
// 예상치 못한 값을 받아 처리할 때 발생

// 시스템 에러 : 개발자가 코드상으로 조취를 취할 수 없는 문제 (전원 부족, 메모리 부족)
// 컴파일 에러 : 컴파일이 불가능한 상태 (오타, 참조 타입, 불일치...)
// 런타임 에러 : 프로그램이 실행 도중 발생하는 문제 (빌드 실패, 포트 중복, 데이터베이스 연결 실패...)
// 로직 에러 : 프로그램의 아웃풋이 예상과 다르게 나오는 문제
// 예외 : 정상적인 입력에서는 정상 처리가 되지만 비정상적인 입력에서 처리가 되지 않는 문제 (null 값 참조, 로직 실행 중 데이터 베이스 연결 실패)



public class ExceptionHandling {

	// throws 예외클래스 : 해당 예외를 호출부로 책임을 전가
	// throws가 선언부에 추가된 메서드를 호출하는 곳에서
	// 예외처리에 대한 강제성이 부여됨
	private static void bringException() throws Exception{
		Exception exception = new Exception("예외 던지기 발생!");
		throw exception; //throws Exception 적으면 빨간줄 사라짐, 이거 호출한 쪽에서 이거 처리해야함
	}
	
	public static void main(String[] args) {
		
		// 예외 상황
//		Scanner scanner = null;
//		scanner.nextLine();
		
//		int[] numbers = {1, 2, 3};
//		System.out.println(numbers[4]);
		
		// 예외 처리
		// 예외를 예상하고 그 상황에 대해서 적절한 대처를 해주는 것
		// 가장 좋은 것 (예외가 발생하지 않도록 하는 것)
		
		// try - catch 문으로 예외 잡기
		// try 구문에 예외가 발생 할 수 있는 문장을 작성
		// catch 구문에 해당 예외 상황에 대한 대처 구문을 작성
		
		// 사용 방법
		// try { 예외가 발생할 수 있는 문장 }
		// catch (예외타입 예외참조변수) { 예외가 발생했을 때 처리할 문장 }
		
		Scanner scanner = null;
		
		try {
			int number = scanner.nextInt();
		} catch(NullPointerException exception) {
			System.out.println("Null Pointer Exception 발생!");
		}
		
//		exception 클래스로 예외생성
		try {
			Exception exception = new Exception("고의 예외!"); // 고의 예외가 출력, 우리가 지정한 예외이름
//			throw로 예외 발생
			throw exception;
		}catch(Exception exception) {
			exception.printStackTrace(); // 어디서 예외가 발생했는지도 다 출력
		}
		
		
//		예외처리를 떠 받은 애가 강제적으로 처리해야함!
		try {
			bringException();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
