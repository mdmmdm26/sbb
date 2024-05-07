package com.example.sbb;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.sbb.answer.Answer;
import com.example.sbb.answer.AnswerRepository;
import com.example.sbb.question.Question;
import com.example.sbb.question.QuestionRepository;

@SpringBootTest  // 테스트 클래스
class SbbApplicationTests {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerRepository answerRepository;

	@Test
	void testJpa() {
		
		/*
		Question q1 = new Question();
        q1.setSubject("sbb가 무엇인가요?");
        q1.setContent("sbb에 대해서 알고 싶습니다.");
        q1.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q1);  // 첫번째 질문 저장

        Question q2 = new Question();
        q2.setSubject("스프링부트 모델 질문입니다.");
        q2.setContent("id는 자동으로 생성되나요?");
        q2.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q2);  // 두번째 질문 저장
        */
        
		
		/*
		 List<Question> all = this.questionRepository.findAll();
	     assertEquals(2, all.size()); // 2개의 질문데이터를 저장했기 때문에 데이터 사이즈 = 2

	     Question q = all.get(0);
	     assertEquals("sbb가 무엇인가요?", q.getSubject()); // 첫번째 데이터의 제목이 맞는지
		*/
		
		/*
		Optional<Question> oq = this.questionRepository.findById(1); // id / 리턴값은 Question이 아닌 Optional
		if (oq.isPresent()) { // 값 존재 확인
			Question q = oq.get();
			assertEquals("sbb가 무엇인가요?", q.getSubject());
		}
		*/
		
		/*
		Question q = this.questionRepository.findBySubject("sbb가 무엇인가요?");
        assertEquals(1, q.getId());
        // 메서드 구현하지 않아도 JPA로 가능 => findBy + 엔티티의 속성명 메서드를 작성하면 데이터 조회 가능
		*/
		
		/*
		Question q = this.questionRepository.findBySubjectAndContent("sbb가 무엇인가요?", "sbb에 대해서 알고 싶습니다.");
        assertEquals(1, q.getId());
        // and 외에도 or between lessThan like in orderBy 등등이 있음 * 응답 결과가 여러 건인 경우에는 리턴타입 = List<Question>
		*/
		
		/*
		List<Question> qList = this.questionRepository.findBySubjectLike("sbb%"); //sbb% - 'sbb'로 시작하는 문자열, %sbb - 'sbb'로 끝나는 문자열, %sbb% - 'sbb'를 포함하는 문자열
        Question q = qList.get(0);
        assertEquals("sbb가 무엇인가요?", q.getSubject());
        */
		
		/* 수정
		Optional<Question> oq = this.questionRepository.findById(2);
        assertTrue(oq.isPresent()); // 괄호 안의 값이 참인지
        Question q = oq.get();
        q.setSubject("수정된 제목"); // 제목 수정
        this.questionRepository.save(q); // 리포지터리의 save 메서드 사용
        */
		
		/*
		assertEquals(3, this.questionRepository.count());
        Optional<Question> oq = this.questionRepository.findById(3);
        assertTrue(oq.isPresent());
        Question q = oq.get();
        this.questionRepository.delete(q); // 데이터 삭제
        assertEquals(2, this.questionRepository.count());
        */
        
		
		/* 답변 저장
		Optional<Question> oq = this.questionRepository.findById(2);
        assertTrue(oq.isPresent());
        Question q = oq.get();

        Answer a = new Answer();
        a.setContent("네 자동으로 생성됩니다.");
        a.setQuestion(q);  // 어떤 질문의 답변인지 알기위해서 Question 객체가 필요하다.
        a.setCreateDate(LocalDateTime.now());
        this.answerRepository.save(a);
		*/
		
		/*
		// 답변 조회
		Optional<Answer> oa = this.answerRepository.findById(1);
        assertTrue(oa.isPresent());
        Answer a = oa.get();
        assertEquals(2, a.getQuestion().getId());
		*/
		
		Optional<Question> oq = this.questionRepository.findById(2);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		
		/*
		List<Answer> answerList = q.getAnswerList();

		assertEquals(1, answerList.size());
		assertEquals("네 자동으로 생성됩니다.", answerList.get(0).getContent());
		*/
	}

}
