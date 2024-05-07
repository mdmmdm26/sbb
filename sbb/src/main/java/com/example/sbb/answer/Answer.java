package com.example.sbb.answer;

import java.time.LocalDateTime;

import com.example.sbb.question.Question;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(columnDefinition = "TEXT")
	private String content;
	
	private LocalDateTime createDate;
	
	@ManyToOne	// N:1 (답변 : N, 질문 : 1) => 하나의 질문에 여러개의 답변이 달릴 수 있음 부모 - Question 자식 - Answer
	private Question question;
}
