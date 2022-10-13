package chap4; // 4- 5 

import java.util.Scanner;


/*
 * 양의 정숫값을 0까지 카운트 다운 하는 문제 4-5를 for문으로 변경하되
 * 반복 종료 이후의 x값은 표시하지 않아도 된다. 
 * 
 */
public class CountDownFor {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in) ;
		System.out.println("카운트 다운 합니다." ); 
		int x ;
		do {
			System.out.println("양의 정숫값  ");
			x  = stdIn.nextInt() ;
		}while (x <=0) ;
		
		for( ; x >= 0 ; x--)
		System.out.println(x);
	}
}

