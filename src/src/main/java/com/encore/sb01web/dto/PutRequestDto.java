package com.encore.sb01web.dto;

import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Data;

@Data
					//해당 클래스 전체에 일괄적으로 스네이크케이스를 적용하겠다는 것!
@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
public class PutRequestDto {

	private String name;
	private int age;
	private List<CarDto> carList;
}
