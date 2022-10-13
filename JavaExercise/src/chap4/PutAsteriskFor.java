package chap4; // 4- 11

import java.util.Scanner;

/*
 * 기호 문자를 임의의 갯수만큼 출력했던 4-7 문제를 for문으로 변경하자 
 * for문은 while문보다 코드량이 작고, for문은 while문과 상호간에 변경이 가능하다.
 * 4-7과 4-11은 거의 동일하게 작동한다.
 */

public class PutAsteriskFor {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in) ;
		System.out.println("몇 개의 *을 표시할까요?" ); 
		int n = stdIn.nextInt() ;
		
		if ( n > 0 ) { 
			for(int i = 0 ;   i <n ; i++)
				System.out.println('*');
			
			System.out.println();  // 마지막에서 개행처리 
	}
  }
}

