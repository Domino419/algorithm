package chap4; // 4- 7

import java.util.Scanner;

/*
 * 입력한 값의 갯수만큼 '*'을 표시하는 프로그램을 작성하자. 마지막에는 줄 바꿈 문자를 출력할 것. 
 * 단 읽은 값이 1 미만이면 줄 바꿈 문자를 표시해서는 안된다.
 */

public class PutAsterisk1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in) ;
		System.out.println("몇 개의 *을 표시할까요?" ); 
		int n = stdIn.nextInt() ;
		
		if ( n > 0 ) { // 입력받은 n이 0보다 크면 
			int i = 0 ;
		while ( i < n) {
			System.out.println('*');
			i++ ;
		}
		System.out.println();
	}
		/*
		 * 문자 리터럴 (character literal ) 
		 * 화면에서 출력하는 '*'과 같이 단밀 문자를 작은 따옴표로 감사면 문자 리터럴이라고 하며 
		 * 문자열 리터럴과는 다르므로 주의해야 한다.
		 * "*" = 문자열 리터럴 , Stirng형  
		 * '*' = 문자 리터럴 , char형 
		 */
  }
}

