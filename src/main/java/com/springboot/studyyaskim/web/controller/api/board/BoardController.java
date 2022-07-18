package com.springboot.studyyaskim.web.controller.api.board;



import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.studyyaskim.service.board.BoardService;
import com.springboot.studyyaskim.web.dto.board.CreateBoardReqDto;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/api/v1/board")
@RequiredArgsConstructor
public class BoardController {
	
	private final BoardService boardService;
		
	
	
	//게시글 작성
	@PostMapping("/content")
	public ResponseEntity<?> addBoard(@RequestBody CreateBoardReqDto createBoardReqDto) {
		boolean responseData = false;
		try {
			responseData = boardService.createBoard(createBoardReqDto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.internalServerError().body(responseData);
		}
	return ResponseEntity.ok().body(responseData);
		//return new ResponseEntity<>(title + "게시글 작성 성공", HttpStatus.BAD_REQUEST);
	}

}
