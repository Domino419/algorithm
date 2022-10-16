package chap5;  // 5-6

import java.util.Scanner;

/*
 * 3개의 정숫값을 읽어서 합계와 평균을 구하는 프로그램을 작성하되 
 * 평균은 캐스트 연산자를 이용해서 구하고 실수로 표시할 것 
 */

public class Average3B {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in) ;
		
		System.out.println(" 정숫값 x,y,z의 평균을 구합시다.");
		System.out.println("x : ");  
		int x = stdIn.nextInt() ;
		
		System.out.println("y : ");
		int y = stdIn.nextInt() ;
		
		System.out.println("z : ");
		int z = stdIn.nextInt() ;
		
		// (자료형) x -- x를 자료형으로 변환한 값을 생성 , ()는 메서드 호출 연산자(7장)으로서도 사용한다.
		double ave = (double) (x+y+z) / 3 ;   //평균값
		
		System.out.printf("x,y,z의 평균은 %.3f입니다. \n", ave);  
		
		
	}
}

