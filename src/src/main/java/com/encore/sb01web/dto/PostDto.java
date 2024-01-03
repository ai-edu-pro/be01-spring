package com.encore.sb01web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/*
	JSON 예시
	{
		"account": "이도연",
		"email" : "encore@sw.or.kr",
		"address" : "서울 연희동",
		"password" : "1004",
		"phone_number" : "010-9872-0202",
		"OPT" : "OPT"
	}
*/

@Data
public class PostDto {
	
	private String account;
	private String email;
	private String address;
	private String password;
	
	@JsonProperty("phone_number")
	private String phoneNumber;  // 카멜로 되어 있는 것을 스네이크 형식으로~~~  cf) PascalCase
	
	@JsonProperty("OPT")
	private String OPT; // 카멜도 스네이크도 아닌 것들은 @JsonProperty 사용해서 인식시킨다.
	
}


