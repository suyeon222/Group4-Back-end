package test.com.album.model;

import java.util.List;

public interface AlbumDAO {
	public int insert(AlbumVO vo);
	public int update(AlbumVO vo);
	public int delete(AlbumVO vo);
	public AlbumVO selectOne(AlbumVO vo);
	public List<AlbumVO> selectAll();
	public List<AlbumVO> searchList(String searchKey, String searchWord);
}
