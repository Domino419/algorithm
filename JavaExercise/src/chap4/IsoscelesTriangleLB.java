package chap4; // 4-22
import java.util.Scanner;

/*
 * 기호문자 '*'을 나열해서 직각의 이등변 삼각형을 표시하는 프로그램을 작성하자.
 * 직각의 위치가 왼쪽아래, 왼쪽위, 오른쪽 아래, 오른쪽 위에 표시하는 프로그램을 각각 작성할 것 
 */

public class IsoscelesTriangleLB {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1.왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
		System.out.println("몇 단까지 쌓을까? : ");
		int n = stdIn.nextInt();

		for(int i = 1 ; i <= n ; i++) {  //행   
			for(int j = 1; j<=i  ; j++)   // 열 
				System.out.print('*');
			System.out.println();
		}
		
		System.out.println("2.왼쪽 위가 직각인 이등변 삼각형을 표시합니다.");
		System.out.println("몇 단까지 쌓을까? : ");
		int n2= stdIn.nextInt();
		
		for(int i = 1 ; i <= n2 ; i++) {  //행   
			for(int j = 1 ; j<=n2 - i + 1 ; j++) // 열  위에서 만든 삼각형을 뒤집어서 출력하기 위해서  n-i+1을 해줌
				System.out.print('*');
			System.out.println();
		}
		
		System.out.println("3.오른쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
		System.out.println("몇 단까지 쌓을까? : ");
		int n3= stdIn.nextInt();
		
		for(int i = 1 ; i <= n3 ; i++) {
			for (int j = 1 ; j <= n3-i ; j++)
				System.out.print(' ');  //오른쪽에 공백처리 
			for( int j = 1 ; j<= i ; j++)
 			System.out.print('*');  //왼쪽으로 별표 처리 
		System.out.println();
		}
		
		System.out.println("4.오른쪽 위가 직각인 이등변 삼각형을 표시합니다.");
		System.out.println("몇 단까지 쌓을까? : ");
		int n4= stdIn.nextInt();
		
		for(int i = 1 ; i <= n4 ; i++) {
			for (int j = 1 ; j <= i-1 ; j++)
				System.out.print(' ');  //오른쪽에 공백처리 
			for( int j = 1 ; j<= n4-i+1 ; j++)
 			System.out.print('*');  //왼쪽으로 별표 처리 
		System.out.println();
		}
	}
}

