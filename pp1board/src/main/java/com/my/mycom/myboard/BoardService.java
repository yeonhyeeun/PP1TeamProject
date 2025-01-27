package com.my.mycom.myboard;

import java.util.List;

public interface BoardService {
	public int insertBoard(BoardVO vo);
	public int deleteBoard(int id);
	public int updateBoard(BoardVO vo); 
	public BoardVO getBoard(int seq); 
	public List<BoardVO>getBoardList(); 

}
