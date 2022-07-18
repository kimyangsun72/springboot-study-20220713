package com.springboot.studyyaskim.service.board;

import com.springboot.studyyaskim.web.dto.board.CreateBoardReqDto;

public interface BoardService {
	public boolean createBoard(CreateBoardReqDto createBoardReqDto) throws Exception;
	// public boolean createBoard(CreateBoardReqDto createBoardReqDto) throws Exception;
	
	public boolean updateBoard(int boardcode, CreateBoardReqDto createBoardReqDto) throws Exception;
	public boolean deleteBoard(int boardcode) throws Exception;
	
	

}
