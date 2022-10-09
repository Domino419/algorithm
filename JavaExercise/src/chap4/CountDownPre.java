package chap4; // 4- 6 

import java.util.Scanner;

// 4-5 문제에서 x--를 --x로 고치면 출력이 어떻게 바뀌는지 검증하자. 
// 전위 증감 / 후위 증감 연산자 차이를 학습하기 위한 예제문으로 
//실행시 입력값을 4로주는 경우 4-5는  4.4.3.2.1 ...  4-6은  4.3.2.1 .. 으로 출력이 된다.

public class CountDownPre {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in) ;
		System.out.println("카운트 다운 합니다." ); 
		int x ;
		
		do {
			System.out.println("양의 정숫값  ");
			x  = stdIn.nextInt() ;
			
		}while ( x <= 0) ; // do 문 종료시 x는 무조건 양의 값이 되도록 한다. 
		
		while ( x>= 0) 
	//		System.out.println(x--);
     		System.out.println(--x);
		    System.out.println(" x의 값이 " + x + "이 됐습니다. ");
	
	}
}

