package chap4; // 4-4
// 두 정수의 사이의 정수를 작은 것부터 순서대로 표기 
// 두 개의 정숫값을 읽어서 두 정수 사이에 있는 모든 정숫값을 작은 것부터 큰 순으로 표시하는 프로그램을 작성하자.

import java.util.Scanner;

public class EnumScope {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in) ;
		System.out.println("정수 A  : " ); 
		int a = stdIn.nextInt() ;
		
		System.out.println("정수 B  : " ); 
		int b = stdIn.nextInt() ;

		// 정렬하는 부분 
		if (a > b) {  // a가 b보다 크면 
			int t = a ; 
			a = b; 
			b = t; 
		}
		
		// a에 +1을 하면서 정수를 표시하자 
		do {
			System.out.println(a + " ");
			a = a + 1 ;
			
		}while ( a <= b) ;
    		System.out.println();
	}
}

