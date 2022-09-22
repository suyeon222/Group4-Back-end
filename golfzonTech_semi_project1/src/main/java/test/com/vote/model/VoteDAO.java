package test.com.vote.model;

import java.util.List;

public interface VoteDAO {
	public int insert(VoteVO vo); // 투표 생성
	public int update(VoteVO vo); // 투표 수정
	public int delete(VoteVO vo); // 투표 삭제
	public VoteVO selectOne(VoteVO vo); // 투표 선택
	public List<VoteVO> selectAll(); // 전체 투표 조회
}
