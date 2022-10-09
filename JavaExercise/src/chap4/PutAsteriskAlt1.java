package chap4; // 4- 7

import java.util.Scanner;

/*
 * 읽은 값의 갯수만큼 '*'과 *+*를 번갈아 가며 표시하는 프로그램을 작성하자.
 * 마지막에는 줄 바꿈 문자를 출력할 것 
 */

public class PutAsteriskAlt1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in) ;
		System.out.println("몇 개을 표시할까요?" ); 
		int n = stdIn.nextInt() ;
		
		if ( n > 0 ) { 
			int i = 0 ;
		while ( i < n) {
			if( i % 2 == 0) //i가 짝수이면 *을 출력하자! 
    			System.out.println('*');
			else           //i가 홀수이면 +를 출력하자!  
				System.out.println('+');
    			i++ ;
		}
		System.out.println();  // 마지막에서 개행처리 
	}
  }
}

