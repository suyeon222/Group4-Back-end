package test.com.event.model;

import java.util.List;


public interface EventDAO {
	
	public EventVO selectOne(); // 이벤트 선택
	public List<EventVO> selectAll(); // 전체 이벤트 출력
	public List<EventVO> searchList(String searchKey, String searchWord); // 이벤트 키워드 출력
	
}
