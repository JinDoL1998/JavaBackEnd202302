package board.controller;

import board.dto.request.user.SignUpDto;
import board.dto.response.ResponseDto;
import board.service.UserService;

public class UserController {

	private UserService userService;
	
	public UserController() {
		userService = new UserService();
	}
	
	public void signUp(SignUpDto dto) {
		
		if(dto.validate()) {
			System.out.println("400 Bad Request");
			System.out.println("모든 값을 입력하세요");
			return;
		}
		
		ResponseDto<Boolean> response = userService.signUp(dto);
		System.out.println(response.toString());
		
	}
}