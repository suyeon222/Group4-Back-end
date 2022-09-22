package test.com.comment.model;

import java.util.List;

public interface CommentDAO {

	public int insert(CommentVO vo); // 댓글 작성
	public int update(CommentVO vo); // 댓글 수정
	public int delete(CommentVO vo); // 댓글 삭제
	public CommentVO selectOne(CommentVO vo); // 댓글 선택 (수정, 삭제용)
	public List<CommentVO> selectAll(); // 댓글 전체조회
	
}
