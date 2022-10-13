package chap4; // 4- 14

import java.util.Scanner;


/*
 * 1부터 n까지의 합 구하기 
 */
public class SumUpfor {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in) ;
		System.out.println("1부터 N까지의 합을 구합시다.." ); 
		int n ;
		do {
			System.out.println("N의 값 ");
			n  = stdIn.nextInt() ;
		}while (n <=0) ;
		
		int sum = 0 ;
		for(int i = 0 ; i <= n ; i++)
			sum += i ;
		    System.out.println(sum);
	}
}

