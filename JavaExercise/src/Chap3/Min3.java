package Chap3;

import java.util.Scanner;

public class Min3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in) ;
		
		System.out.println("정수 a : ");
		int a = stdIn.nextInt();
		
		System.out.println("정수 b : ");
		int b = stdIn.nextInt();
		
		System.out.println("정수 c : ");
		int c = stdIn.nextInt();
		
		int min = a ;  // min을 a값으로 초기화 한다. 
		
		if ( b < min )   //b가 a보다 작으면 min에 b값을 대입한다.  
			min = b ;

		if ( c <min ) 
			min = c ;   // c가 min보다 작으면 min에 c를 대입한다. 
		
			
		System.out.println("가장 작은 값은 " + min + "입니다.");
	}

}
