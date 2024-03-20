package edu.ezen.practice.enums;

public enum BoardType {
	NOTI(0), 	// 공지사항 
	QNA(1),		// qna
	FREE(2);	// 자유
	
   private final int value;
   private BoardType(int value) {
       this.value = value;
   }

   public int getValue() {
       return value;
   }
}
