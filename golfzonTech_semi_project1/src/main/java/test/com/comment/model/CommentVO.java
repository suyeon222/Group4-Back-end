package test.com.comment.model;

import java.sql.Date;

public class CommentVO {
	private long comment_id; // 댓글 번호
	private long board_id; // 게시글번호
	private String comment; // 댓글 내용
	private String commenter; // 댓글 작성자
	private Date cdate; // 댓글 작성 일자

}
