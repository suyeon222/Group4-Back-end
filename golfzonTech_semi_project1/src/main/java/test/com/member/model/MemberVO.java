package test.com.member.model;

import java.sql.Date;

public class MemberVO {
	private String member_id; //회원 아이디
	private String pw; // 회원 비밀번호
	private String name; // 회원 이름
	private String gender; // 회원 성별
	private Date birth; // 회원 생년월일
	private String location; // 회원 지역
	private String img_name; //회원 프로필 사진명
	private int score; // 회원 골프 핸디값
}