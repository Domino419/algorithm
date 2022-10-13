package chap4; // 4-24
import java.util.Scanner;

/*
 * N단의 피라미드를 표시하는 프로그램을 작성하자. 
 * i번째 행에는 i % 10 을 표시할 것 
 * */

public class DigitPyramid {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("피라미드를 표시합시다..");
		System.out.println("몇 단까지 쌓을까? : ");
		int n = stdIn.nextInt();
		
		for ( int i = 1 ; i <= n ; i++) {  // 단수를 표시 ( 입력받은 n개만큼 for문 진행 ) 
			// 행 표시를 위한 for문 
			
			for ( int j = 1 ; j <= n-i ; j++)   // n-i 로 i행째에 표시할 공백 갯수 
				System.out.print(' ');
			
			for ( int j = 1 ; j <= (2*i) -1 ; j++)  //  2 * i -1 로 i행에 표시할 *의 갯수
	//			System.out.print('*');
    			System.out.print(i % 10 );   // 문제에서 제시한  i % 10 
			System.out.println();
		}
	}
}

