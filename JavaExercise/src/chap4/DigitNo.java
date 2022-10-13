package chap4; //123page

import java.util.Scanner;

/*
 * 양의 정숫값을 읽어서 그 자릿수를 출력하는 프로그램을 작성하자.
 */

public class DigitNo {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in) ;
		System.out.println("양의 정숫값의 자릿수를 표시합니다." );
		int x ; 
	
		do {  // 우선 양의 정숫값으로 로그를 찍고 x를 입력 받자 
			System.out.println("양의 정숫값");
			x= stdIn.nextInt() ;
			
			
			// x가 0보다 작거나 같으면 digit를 0으로 선언 
		}while (x<=0) ;
				int digit = 0 ;
				
				// digit에 1을 증가시키고 10으로 나눔 
				while (x>0) {
				digit++ ;
				x/=10 ;
				}
				
				System.out.println("입력한 숫자는"+ digit + "자리입니다.");
		}
	 }

