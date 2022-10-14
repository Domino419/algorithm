package chap4; // 4-27
import java.util.Scanner;

/*
 *정숫값을 읽어서 합계와 평균을 구하는 프로그램을 작성하다. 
 *단 정숫값의 입력은 합계가 1,000을 넘지 않은 범위안에서 이루어질 것 
 * */

public class SumBreak2Ave {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 더합시다. ");
		System.out.println("몇개를 더할까요~? ");
		int n = stdIn.nextInt() ; //정수의 갯수를 받자 
		
		int sum = 0 ; // 합계를 저장할 sum 변수 
		int i ; 
		
		for ( i = 0 ; i < n ; i ++) {
			System.out.println(" 정수 : ");
			int t = stdIn.nextInt() ; 
			
			if (sum +  t > 1000 )  {
				System.out.println(" 합계가 1000을 넘었어요~! ");
    			System.out.println(" 마지막 값을 무시합시다. ");
				break ; 
			}
			sum += t ;   // 합계가 1000을 넘지 않았으니까 sum + t 
		}
		System.out.println(" 합계는 " + sum + "입니다");
		if ( i != 0 )
			System.out.println(" 평균은 " + sum / i + "입니다");
	}
}
