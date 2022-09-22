package test.com.board.model;

import java.sql.Date;

public class BoardVO {
	private long board_id; // 게시글 번호
	private long club_id; // 해당 모임ID
	private String writer; // 작성자 id 
	private String title; // 게시글 제목
	private String content; // 게시글 내용
	private String fname; // 업로드 파일명
	private Date wdate; // 작성일자
	private int notice; // 공지글 여부 (일반글: 0, 공지글: 1)
}
