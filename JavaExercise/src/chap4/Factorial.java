package chap4; //126page

import java.util.Scanner;

/*
 * 양의 정숫값을 읽어서 1부터 N까지의 곱을 구하는 프로그램을 작성하자.
 */

public class Factorial {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in) ;
		int n ; 
	
		do { 
		//	System.out.println("양의 정숫값의 자릿수를 표시합니다." );
			System.out.println("양의 정숫값");
			n= stdIn.nextInt() ;
		}while (n<=0) ;
				
		int factorial = 1;
		int i = 1 ; 
		
	    while (i <= n ) {
	    	factorial *= i ;
	    	i ++ ;
	    }
				System.out.println("1부터 "+ n + "까지의 곱은 "+ factorial + "입니다.");
		}
	 }

