package com.springboot.studyyaskim.domain.board;

import java.time.LocalDateTime;

import com.springboot.studyyaskim.web.dto.board.CreateBoardReqDto;
import com.springboot.studyyaskim.web.dto.board.CreateBoardRespDto;
import com.springboot.studyyaskim.web.dto.board.ReadBoardRespDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Board {
	private int boardcode;
	private String title;
	private int usercode;
	private String username;
	private String content;
	private LocalDateTime createTime;
	private LocalDateTime upDateTime;
	
	public CreateBoardRespDto toDto(boolean insertStatus) {
		return CreateBoardRespDto.builder()
				.boardcode(boardcode)
				.title(title)
				.usercode(usercode)
				
				.content(content)
				.insertStatus(insertStatus)
				.build();
	}

	public CreateBoardRespDto toCreateBoardDto(boolean insertStatus) {
		// TODO Auto-generated method stub
		return null;
	}

	public ReadBoardRespDto toReadBoardDto() {
		// TODO Auto-generated method stub
		return null;
	}

}
