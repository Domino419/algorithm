package chap4; // 4-2
//3자리의 정숫값 읽기 

/**
 * 드 모르간의 법칙 
 * x가 3자리의 양의 정수가 아닌 경우 푸르 바디가 싱핼되여 "세 자리의 양의 정숫값:"을 표시해서 다시 입력해야 한다.
 */
import java.util.Scanner;

public class ThreeDigits {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in) ;
		int x ; 
		
		do {
			System.out.println("세 자리의 정숫값 : ");
			x= stdIn.nextInt() ;
		} while (x < 100 || x > 999) ;
		
		System.out.println("입력한 값은 " + x + "입니다.");
	}
}

