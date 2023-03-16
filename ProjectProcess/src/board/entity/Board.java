package board.entity;

import java.util.List;

// 게시물
//
// 게시물 번호 (int) / 이미지 (String) / 
// 작성자 이메일 (String) / 작성자 닉네임 (String) / 작성자 프로필 사진 (String) / 작성일 (String) / 
// 제목 (String) / 내용 (String) /  조회 수 (int)                                                                                                                                      
// 좋아요(좋아요한 사용자 프로필 사진, 좋아요 한 사용자 닉네임) 리스트 / 
// 댓글(댓글 작성자 프로필 사진, 댓글 작성자 닉네임, 댓글 작성 지난 시간, 댓글 내용) 리스트

public class Board {
	
	private int boardNumber;
	private String boardImageUrl;
	private String writerEmail;
	private String writerNickname;
	private String writerProfileImageUrl;
	private String writerDate;
	private String title;
	private String content;
	private int viewCount;
	private List<Like> likeList;
	private List<Comment> commentList;
	
	public Board() {}

	public Board(int boardNumber, String boardImageUrl, String writerEmail, String writerNickname,
			String writerProfileImageUrl, String writerDate, String title, String content, int viewCount,
			List<Like> likeList, List<Comment> commentList) {
		this.boardNumber = boardNumber;
		this.boardImageUrl = boardImageUrl;
		this.writerEmail = writerEmail;
		this.writerNickname = writerNickname;
		this.writerProfileImageUrl = writerProfileImageUrl;
		this.writerDate = writerDate;
		this.title = title;
		this.content = content;
		this.viewCount = viewCount;
		this.likeList = likeList;
		this.commentList = commentList;
	}

	public int getBoardNumber() {
		return boardNumber;
	}

	public String getBoardImageUrl() {
		return boardImageUrl;
	}

	public String getWriterEmail() {
		return writerEmail;
	}

	public String getWriterNickname() {
		return writerNickname;
	}

	public String getWriterProfileImageUrl() {
		return writerProfileImageUrl;
	}

	public String getWriterDate() {
		return writerDate;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public int getViewCount() {
		return viewCount;
	}

	public List<Like> getLikeList() {
		return likeList;
	}

	public List<Comment> getCommentList() {
		return commentList;
	}

	public void setBoardNumber(int boardNumber) {
		this.boardNumber = boardNumber;
	}

	public void setBoardImageUrl(String boardImageUrl) {
		this.boardImageUrl = boardImageUrl;
	}

	public void setWriterEmail(String writerEmail) {
		this.writerEmail = writerEmail;
	}

	public void setWriterNickname(String writerNickname) {
		this.writerNickname = writerNickname;
	}

	public void setWriterProfileImageUrl(String writerProfileImageUrl) {
		this.writerProfileImageUrl = writerProfileImageUrl;
	}

	public void setWriterDate(String writerDate) {
		this.writerDate = writerDate;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	public void setLikeList(List<Like> likeList) {
		this.likeList = likeList;
	}

	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}

	@Override
	public String toString() {
		return "Board [boardNumber=" + boardNumber + ", boardImageUrl=" + boardImageUrl + ", writerEmail=" + writerEmail
				+ ", writerNickname=" + writerNickname + ", writerProfileImageUrl=" + writerProfileImageUrl
				+ ", writerDate=" + writerDate + ", title=" + title + ", content=" + content + ", viewCount="
				+ viewCount + ", likeList=" + likeList + ", commentList=" + commentList + "]";
	}
	
	
	
}
