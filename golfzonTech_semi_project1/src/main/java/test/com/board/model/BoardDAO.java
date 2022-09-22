package test.com.board.model;

import java.util.List;

public interface BoardDAO {
	public int insert(BoardVO vo);
	public int update(BoardVO vo);
	// 게시글 수정 (공지글 수정 기능 포함), 일반글 -> 게시글 wdate 갱신
	public int delete(BoardVO vo);
	public BoardVO selectOne(BoardVO vo);
	public List<BoardVO> selectAll();
	public List<BoardVO> searchList(String searchKey, String searchWord);
}