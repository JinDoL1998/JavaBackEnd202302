package board;

import java.util.Scanner;

import board.common.constant.HttpStatus;
import board.controller.BoardController;
import board.controller.UserController;
import board.dto.request.user.SignInDto;
import board.dto.request.user.SignUpDto;
import board.dto.response.board.PostBoardDto;

public class BoardApplication {

	private static UserController userController = new UserController();
	private static BoardController boardController = new BoardController();
	
	private static final String SIGN_UP = "POST /sign-up";
	private static final String SIGN_IN = "POST /sign-in";
	
	private static final String POST_BOARD = "POST /board";
	
	private static final String GET_BOARD = "GET /board";  
	private static final String GET_BOARD_LIST = "GET /board/list";
	
	private static final String PATCH_BOARD = "PATCH /board";
	
	private static final String DELETE_BOARD = "DELETE /board";
	
	public static void main(String[] args) {
		
		while(true) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("URL End Point : ");
			String endPoint = scanner.nextLine();
			
			switch(endPoint) {
			
			case SIGN_UP:
				SignUpDto signUpDto = new SignUpDto();
				System.out.print("이메일 주소 : ");
				signUpDto.setEmail(scanner.nextLine());
				System.out.print("비밀번호 : ");
				signUpDto.setPassword(scanner.nextLine());
				System.out.print("비밀번호 확인 : ");
				signUpDto.setPasswordCheck(scanner.nextLine());
				System.out.print("닉네임 : ");
				signUpDto.setNickName(scanner.nextLine());
				System.out.print("전화번호 : ");
				signUpDto.setPhoneNumber(scanner.nextLine());
				System.out.print("주소 : ");
				signUpDto.setAddress(scanner.nextLine());
				System.out.print("상세 주소 : ");
				signUpDto.setAddressDetail(scanner.nextLine());
				
				// System.out.println(signUpdto.toString());
				
				userController.signUp(signUpDto);
				break;
				
			case SIGN_IN:
				SignInDto signInDto = new SignInDto();
				System.out.print("이메일 주소 : ");
				signInDto.setEmail(scanner.nextLine());
				System.out.print("비밀번호 : ");
				signInDto.setPassword(scanner.nextLine());
				
				// System.out.println(signInDto.toString());
				userController.signIn(signInDto);
				break;
				
			case POST_BOARD:
				PostBoardDto postBoardDto = new PostBoardDto();
				System.out.print("제목 : ");
				postBoardDto.setTitle(scanner.nextLine());
				System.out.print("내용 : ");
				postBoardDto.setContent(scanner.nextLine());
				System.out.print("이미지 : ");
				postBoardDto.setBoardImageUrl(scanner.nextLine());
				System.out.print("작성자 이메일 : ");
				postBoardDto.setWriterEmail(scanner.nextLine());
				
				boardController.postBoard(postBoardDto);
				break;
				
			case GET_BOARD_LIST:
				
				boardController.getBoardList();
				break;
				
			case GET_BOARD:
				
				int boardNumber = 0;
				
				try {
					System.out.println("게시물 번호 : ");
					boardNumber = scanner.nextInt();
				} catch (Exception exception){
					exception.printStackTrace();
					continue;
				}
				
				boardController.getBoard(boardNumber);
				
			default:
				System.out.println(HttpStatus.NOT_FOUND);
				
			}
			
		}
		
	}

}
