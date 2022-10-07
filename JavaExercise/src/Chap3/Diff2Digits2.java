package Chap3;

import java.util.Scanner;

public class Diff2Digits2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in) ;
		
		System.out.println("정수 a : ");
		int a = stdIn.nextInt();
		
		System.out.println("정수 b : ");
		int b = stdIn.nextInt();
		
		int diff = a>= b ? a-b : b-a ;
		
	    System.out.println("두 값의 차이는 " +( diff <= 10 ? "10 이상"  : " 11이상")+"입니다" );
	}

}
// Diff2Digits1에 비해서 메시지 출력부분을 한번만 작성하면 된다.
// 다른 문자열의 변경이 용이하다.
