package com.masai.exception;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyErrorEntity {

	private String Description;
	private String message;
	private LocalDateTime setDateTime;
	
}
