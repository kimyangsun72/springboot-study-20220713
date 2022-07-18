package com.springboot.studyyaskim.service.board;

import org.springframework.stereotype.Service;

import com.springboot.studyyaskim.domain.board.BoardRepository;
import com.springboot.studyyaskim.web.dto.board.CreateBoardReqDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

 public class BoardServiceImpl implements BoardService{
	
	private final BoardRepository boardRepository;

	@Override
	public boolean createBoard(CreateBoardReqDto createBoardReqDto) throws Exception {
		return boardRepository.save(createBoardReqDto.toEntity()) > 0; 
	}

	@Override
	public boolean updateBoard(int boardcode, CreateBoardReqDto createBoardReqDto) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteBoard(int boardcode) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	
}
