package chap5;  // 5-5

import java.util.Scanner;

/*
 * 3개의 정숫값을 읽어서 합계와 평균을 구하는 프로그램을 작성하되 평균은 싱수로 표시할 것 
 */

public class Average3Wrong {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in) ;
		
		System.out.println(" 정숫값 x,y,z의 평균을 구합시다.");
		System.out.println("x : ");  
		int x = stdIn.nextInt() ;
		
		System.out.println("y : ");
		int y = stdIn.nextInt() ;
		
		System.out.println("z : ");
		int z = stdIn.nextInt() ;
		
		double ave = (x+y+z) / 3 ;   //평균값 계산
		System.out.printf("x,y,z의 평균은 %.3f입니다. \n", ave);  
		
		
	}
}

