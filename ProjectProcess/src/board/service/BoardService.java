package board.service;

import board.repository.BoardRepository;

public class BoardService {
	
	private BoardRepository boardRepository = new BoardRepository();
	
	public BoardService() {
		boardRepository = new BoardRepository();
	}
	
	
}
