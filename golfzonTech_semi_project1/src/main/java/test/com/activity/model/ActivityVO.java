package test.com.activity.model;

import java.sql.Date;

public class ActivityVO {
	private long act_id; // 액티비티ID
	private String act_leader; // 액티비티 개설자
	private String cc_id; // cc이름
	private String act_name; // 액티비티명
	private String act_content; // 액티비티 설명
	private int gender; // 액티비티 가입조건(성별)
	private int age; // 액티비티 가입조건(연령대)
	private int score; // 액티비티 가입조건(핸디)
	private int cost; // 액티비티 비용 (조건X)
	private Date rdate; // 액티비티 라운딩 날짜
	private Date adate; // 액티비티 모집 마감일자
}
