package Chap3;

import java.util.Scanner;

public class Absolute1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in) ;
		
		System.out.println("정숫값 : ");
		int n = stdIn.nextInt();
		int abs ;
		
		
		if (n >= 0)
			abs = n ;
		else 
			abs = -n ;
		System.out.println("절대값은" + abs + "입니다.");
	}

	/**
	 * if-then-else문 형식
	 * 
	 * if(조건식) 
	 *  실행문
	 * else 
	 *  실행문
	 */
}
