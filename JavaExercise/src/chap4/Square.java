package chap4; // 4-21
import java.util.Scanner;

/*
 * 기호문자 '*'을 나열해서 n단의 정방향을 표시하는 프로그램을 작성하자.
 */

public class Square {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정방향을 표시합니다.");
		System.out.println("단수는 : ");
		int n = stdIn.nextInt();

		for(int i = 1 ; i <= n ; i++) {  //i를 입력받은 숫자 횟수만큼 for문 진행 
			for(int j = 1; j<=n ; j++)   // *은 입력받은 숫자만큼 찍어주기 
				System.out.print('*');
			System.out.println();
		}
	}
}

