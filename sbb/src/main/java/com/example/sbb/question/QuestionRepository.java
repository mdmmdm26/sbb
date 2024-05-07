package com.example.sbb.question;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
	// Question 엔티티로 리포지터리를 생성한다 기본키가 Integer
	Question findBySubject(String subject);
	Question findBySubjectAndContent(String subject, String content); // 두개의 열을 조회하기 위해 and 연산자 사용
	List<Question> findBySubjectLike(String subject); // 특정 문자 열을 포함하는 데이터를 찾기 위해
}
