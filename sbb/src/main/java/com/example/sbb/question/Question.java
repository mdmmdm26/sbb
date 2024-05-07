package com.example.sbb.question;

import java.time.LocalDateTime;
import java.util.List;

import com.example.sbb.answer.Answer;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Question {
	@Id	// 기본 키
	@GeneratedValue(strategy = GenerationType.IDENTITY) //값을 일일이 입력하지 않아도 자동으로 1씩 증가하여 저장
	private Integer id;
	
	@Column(length = 200) // 열의 세부설정
	private String subject;
	
	@Column(columnDefinition = "TEXT") // TEXT를 열 데이터로
	private String content;
	
	private LocalDateTime createDate;
	
	@OneToMany (mappedBy = "question", cascade = CascadeType.REMOVE) // 1 : N 질문 하나에 답변은 여러개이므로 Question 엔티티에 추가할 Answer 속성은 List형태로 구성
	private List<Answer> answerList;
	
}
