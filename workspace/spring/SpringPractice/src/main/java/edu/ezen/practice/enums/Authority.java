package edu.ezen.practice.enums;

public enum Authority {
	ROLE_NONE(0),
	ROLE_USER(1),
	ROLE_ADMIN(2);
	
   private final int value;
   private Authority(int value) {
       this.value = value;
   }

   public int getValue() {
       return value;
   }
}
