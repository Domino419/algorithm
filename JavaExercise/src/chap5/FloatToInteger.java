package chap5;  // 5-7

import java.util.Scanner;

/*
 * int형 변화에 실숫값을 대입 
 */

public class FloatToInteger {

	public static void main(String[] args) {
		int a ;
		
		a = (int) 10.0 ;
//		a = 10.0; //오류 
		
		System.out.println("a = "+ a);
	}
}

