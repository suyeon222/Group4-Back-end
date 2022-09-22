package test.com.activity.model;

import java.util.List;

public interface ActivityDAO {
	
	public int insert(); // 액티비티 생성
	public int update(); // 액티비티 설정
	public int delete(); // 액티비티 삭제
//	public int expire(); // 액티비티 마감
	public ActivityVO selectOne(); // 액티비티 선택
	public List<ActivityVO> selectAll(); // 전체 액티비티 출력
	public List<ActivityVO> searchList(String searchKey, String searchWord); // 액티비티 키워드 출력

}
