package test.com.album.model;

import java.sql.Date;

public class AlbumVO {
	private long album_id; // 앨범 게시글 번호
	private String club_id; // 모임 id
	private String title; // 앨범 제목
	private String fname; // 앨범 파일명
	private Date wdate; // 업로드 일자
	private String writer; // 업로드 일자 (Session)
}
