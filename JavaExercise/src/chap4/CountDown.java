package chap4; // 4- 5 

import java.util.Scanner;

// 입력 받은 정숫값부터 0까지 카운트다운 하는 프로그램으로ㅓ 
//카운트다운 종료 후의 변숫값을 확인할 수 있도록 할 것 
public class CountDown {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in) ;
		System.out.println("카운트 다운 합니다." ); 
		
		int x ;
		do {
			System.out.println("양의 정숫값  ");
			x  = stdIn.nextInt() ;
		}while ( x <= 0) ; // do 문 종료시 x는 무조건 양의 값이 되도록 한다. 
		while ( x>= 0) 
			System.out.println(x--);
		    System.out.println(" x의 값이 " + x + "이 됐습니다. ");
	
	}
}

