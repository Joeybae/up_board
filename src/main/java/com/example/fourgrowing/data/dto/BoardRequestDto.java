package com.example.fourgrowing.data.dto;

import com.example.fourgrowing.data.entity.Board;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@NoArgsConstructor
public class BoardRequestDto {
	private Long id;
	@NotEmpty(message = "제목은 필수항목입니다.")
	private String title;
	@NotEmpty(message = "내용은 필수항목입니다.")
	private String content;
	@NotEmpty(message = "등록자는 필수항목입니다.")
	private String registerId;
	
	public Board toEntity() {
		return Board.builder()
			.title(title)
			.content(content)
			.registerId(registerId)
			.build();
	}

	@Override
	public String toString() {
		return "BoardRequestDto [id=" + id + ", title=" + title + ", content=" + content + ", registerId=" + registerId
				+ "]";
	}
}