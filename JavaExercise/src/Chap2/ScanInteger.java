package Chap2;

import java.util.Scanner;

public class ScanInteger {

	public static void main(String[] args) {
		// main 메서드 시작 부분에 값을 입력받는 c 이전에 작성한다. 
		Scanner stdIn = new Scanner(System.in) ;
		
		System.out.println("정수값 : ");
	int x = stdIn.nextInt() ;
	System.out.println(x + "를 입력했습니다.");

	}

}
