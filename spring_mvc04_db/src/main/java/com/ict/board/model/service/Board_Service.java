package com.ict.board.model.service;

import java.util.List;
import java.util.Map;

import com.ict.board.model.vo.Board_VO;

public interface Board_Service {
	// 페이징 기법 (리스트불러오기)
	int getTotalCount();
	List<Board_VO> getList(int offset, int limit);
	// 삽입하기
	int getInsert(Board_VO bv);
	
	// 원리스트 hit 업데이트
	int getBoardHit(String idx);
	
	//원리스트 상세보기
	Board_VO getBoardOneList(String idx);
	//
	int getLevUpdate(Map<String, Integer> map);
	int getAnsInsert(Board_VO bv);
	
	// 원글 삭제
	int getDelete(String idx);
}
