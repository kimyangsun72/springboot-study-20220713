package com.springboot.studyyaskim.web.dto.board;

import com.springboot.studyyaskim.domain.board.Board;

import lombok.Builder;
import lombok.Data;

@Data
public class CreateBoardReqDto {
	
	private String title;
	private int usercode;
	private String content;
	public Board toEntity() {
		return Board.builder()
				.title(title)
				.usercode(usercode)
				.content(content)
				.build();
	}

}
