package chap4; // 4-28
import java.util.Scanner;

/*
 *정숫값을 연달아 읽어서 음수가 아닌 값의 합계와 평균을 구하자. 
 *음수의 갯수는 평균을 구할 때 분모에서 제외할 것 
 * */

public class SumContinueAve {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 더합시다. ");
		System.out.println("몇개를 더할까요~? ");
		int n = stdIn.nextInt() ; //정수의 갯수를 받자 
		int sum = 0; // 합계를 저장할 sum 변수
		int i;
		int cntMinus  = 0 ; // 마이너스 갯수를 저장할 cntMinus변수 

		for (i = 0; i < n; i++) {
			System.out.println(" 정수 : "); // n갯수만큼 정수를 입력받기 
			int t = stdIn.nextInt();

			// 4-27에서 작성했던 거 주석 처리 
//			if (sum +  t > 1000 )  {
//				System.out.println(" 합계가 1000을 넘었어요~! ");
//    			System.out.println(" 마지막 값을 무시합시다. ");
//				break ; 
			
			if (t < 0 ) {  //t가 음수이면 
				System.out.println("음수는 더하지 않을 꺼에요!  ");
				System.out.println("대신 음수 갯수는 count 할 꺼에요 ~  ");
				cntMinus++ ;
				continue ; // 음수면 루프 바디의 나머지를 건너뜀 
			}
			sum += t;  // 음수가 아닌 것만 sum에 더해주기 
		}
		System.out.println(" 합계는 " + sum + "입니다");
		if (i != 0)
			System.out.println(" 평균은 " + sum / (n-cntMinus) + "입니다");
		
	}
}
