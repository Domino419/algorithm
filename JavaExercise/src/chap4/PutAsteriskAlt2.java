package chap4; //121page

import java.util.Scanner;

/*
 * 읽은 값의 갯수만큼 '*'과 *+*를 번갈아 가며 표시하는 프로그램을 작성하자.
 * 마지막에는 줄 바꿈 문자를 출력할 것 
 * 변경에 대응하기 좋은 코드로 변경 
 */

public class PutAsteriskAlt2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in) ;
		System.out.println("몇 개을 표시할까요?" ); 
		int n = stdIn.nextInt() ;
		
		if ( n > 0 ) { 
		 int i = 0 ;
		 while ( i < n / 2) { // n / 2개의 "*+"를 출력 
			System.out.println("*+");
			i++ ;
		 }
		 if(n%2 == 1) 
			 System.out.println('*');
		 System.out.println();
		System.out.println();  // 마지막에서 개행처리 
		}
	}
  }

