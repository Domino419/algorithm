package chap4; // 4-1

import java.util.Scanner;

public class SignRepeat {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in) ;
		int retry ; //다시 한번 ? 
		
		do {
			System.out.println("정숫값 : ");
			int n = stdIn.nextInt() ;
		if (n > 0)
			System.out.println("이 값은 양수입니다.");
		else if (n < 0)
			System.out.println("이 값은 음수입니다.");
		else 
			System.out.println("이 값은 0입니다.");
		do {
		System.out.println("다시 한번 ? 1 - yes / 0 - No:");
		retry= stdIn.nextInt() ;

		} while (retry !=0 && retry != 1) ;
	} while (retry == 1) ;
	}
}

