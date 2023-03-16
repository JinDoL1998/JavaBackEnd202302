package board.entity;

import java.util.Date;

// 댓글
// 
// 댓글 작성자 프로필 사진 (String) / 
// 댓글 작성자 닉네임 (String) / 
// 댓글 작성 날짜 및 시간 (date) / 
// 댓글 내용 (String)


public class Comment {
	
	private String writerProfileImageUrl;
	private String wrieterNickname;
	private Date writeDateTime;
	private String content;
	
	public Comment() {}

	public Comment(String writerProfileImageUrl, String wrieterNickname, Date writeDateTime, String content) {
		this.writerProfileImageUrl = writerProfileImageUrl;
		this.wrieterNickname = wrieterNickname;
		this.writeDateTime = writeDateTime;
		this.content = content;
	}

	public String getWriterProfileImageUrl() {
		return writerProfileImageUrl;
	}

	public String getWrieterNickname() {
		return wrieterNickname;
	}

	public Date getWriteDateTime() {
		return writeDateTime;
	}

	public String getContent() {
		return content;
	}

	public void setWriterProfileImageUrl(String writerProfileImageUrl) {
		this.writerProfileImageUrl = writerProfileImageUrl;
	}

	public void setWrieterNickname(String wrieterNickname) {
		this.wrieterNickname = wrieterNickname;
	}

	public void setWriteDateTime(Date writeDateTime) {
		this.writeDateTime = writeDateTime;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Comment [writerProfileImageUrl=" + writerProfileImageUrl + ", wrieterNickname=" + wrieterNickname
				+ ", writeDateTime=" + writeDateTime + ", content=" + content + "]";
	}

	
	
	
	
}
