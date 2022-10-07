package Chap3;

import java.util.Scanner;

public class Max2B {
// 읽은 두개의 실수 중에서 큰 쪽을 표시하는 방법1 : if문 사용 
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in) ;
		
		System.out.println("실수 a : ");
		Double a = stdIn.nextDouble();
		
		System.out.println("실수 b : ");
		Double b = stdIn.nextDouble();
		
		Double max  = a < b ? a : b ; // 가장 큰 값을 저장하기 위한 max 변수 선언 
		
//		if (a > b)
//			max = a ;
//		else 
//			max = b ;
		
		
		
		System.out.println("큰 쪽의 값은 " + max + "입니다.");
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
