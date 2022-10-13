package chap4; // 4-26
import java.util.Scanner;

/*
 *정숫값을 연속해서 입력을 받아서 합계와 평균을 구하는 프로그램을 작성해 봅시다~ 
 *0 입력시 프로그램은 종료 처리 하기 
 * */

public class SumBreakAve {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정수를 더합시다. ");
		System.out.println("몇개를 더할까요~? ");
		int n = stdIn.nextInt() ; //정수의 갯수를 받자 
		
		int sum = 0 ; // 합계를 저장할 sum 변수 
		int i ; 
		
		for ( i = 0 ; i < n ; i ++) {
			System.out.println(" 정수 (0으로 종료) : ");
			int t = stdIn.nextInt() ; 
			if ( t == 0 )
				break ; 
			sum += t ; 
		}
		System.out.println(" 합계는 " + sum + "입니다");
		if ( i != 0 )
			System.out.println(" 평균은 " + sum / i + "입니다");
	}
}
