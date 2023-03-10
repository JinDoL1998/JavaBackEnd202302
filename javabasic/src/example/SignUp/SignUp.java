package example.SignUp;

import java.util.Scanner;

class SignUpDto{
	String userId;
	String userPassword;
	String checkUserPassword;
	String userName;
}

// 회원가입 프로세스 구현

public class SignUp {
	
	// 입력
	// 아이디, 패스워드, 패스워드 확인, 이름
	
	public static void main(String[] args) {
		String[] idList = { "qwer", "asdf", "zxcv" };

		// 1. 사용자로부터 아이디, 패스워드, 패스워드 확인, 이름을 입력 받음
		Scanner scanner = new Scanner(System.in);
	
		SignUpDto dto = new SignUpDto();
		
		
		System.out.print("아이디: ");
		dto.userId = scanner.nextLine();
		System.out.print("패스워드: ");
		dto.userPassword = scanner.nextLine();
		System.out.print("패스워드 확인: ");
		dto.checkUserPassword = scanner.nextLine();
		System.out.print("이름: ");
		dto.userName = scanner.nextLine();
		
		// 2. 모두 입력받았는지 검증
		// string.isBlank(): 문자열이 비었거나 띄어쓰기만으로 구성됐을 때 true 반환, 아니면 false
		if (dto.userId.isBlank() || dto.userPassword.isBlank() || dto.checkUserPassword.isBlank() || dto.userName.isBlank()) {
			System.out.println("모두 입력해주세요");
			return;
		}
		
		// 3-1. 아이디 중복 체크
		// 일반 for문 사용시
//		for(int index = 0; index < idList.length; index++) {
//			if (userId.equals(idList[index])) {
//				System.out.println("이미 존재하는 아이디입니다.");
//				return;
//			}
//		}
		
		// 3-2. foreach문 사용
		for(String id: idList) {
			if(dto.userId.equals(id)) {
				System.out.println("이미 존재하는 아이디입니다.");
				return;
			}
		}
		
		// 4. 비밀번호 확인
		if(!dto.userPassword.equals(dto.checkUserPassword)) {
			System.out.println("비밀번호가 일치하지 않습니다.");
			return;
		}
		System.out.println("성공");
		
	}
	// 결과
	// 성공, 실패 (모두 입력하지 않았을 때, 아이디가 중복될때, 비밀번호가 서로 다를때)

}
