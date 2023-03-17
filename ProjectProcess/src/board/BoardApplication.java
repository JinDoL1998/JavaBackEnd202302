package board;

import java.util.Scanner;

import board.controller.UserController;
import board.dto.request.user.SignUpDto;

public class BoardApplication {

	private static UserController userController = new UserController();
	
	public static void main(String[] args) {
		
		while(true) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("URL End Point : ");
			String endPoint = scanner.nextLine();
			
			switch(endPoint) {
			
			case "POST /sign-up":
				SignUpDto dto = new SignUpDto();
				System.out.println("이메일 주소 : ");
				dto.setEmail(scanner.nextLine());
				System.out.println("비밀번호 : ");
				dto.setPassword(scanner.nextLine());
				System.out.println("비밀번호 확인 : ");
				dto.setPasswordCheck(scanner.nextLine());
				System.out.println("닉네임 : ");
				dto.setNickName(scanner.nextLine());
				System.out.println("전화번호 : ");
				dto.setPhoneNumber(scanner.nextLine());
				System.out.println("주소 : ");
				dto.setAddress(scanner.nextLine());
				System.out.println("상세 주소 : ");
				dto.setAddressDetail(scanner.nextLine());
				
				// System.out.println(dto.toString());
				
				userController.signUp(dto);
				break;
			default:
				System.out.println("404 Not Found");
				
			}
			
		}
		
	}

}
