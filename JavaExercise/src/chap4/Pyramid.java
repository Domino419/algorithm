package chap4; // 4-23
import java.util.Scanner;

/*
 * N단의 피라미드를 표시하는 프로그램을 작성하자. i행째에는 (i-1) * 2 + 1개의 '*' 기호를 표시하고 
 * 마지막행인 n행에서는 (n-1) * 2 + 1개의 '*'을 표시할 것 
 * */

public class Pyramid {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("피라미드를 표시합시다..");
		System.out.println("몇 단까지 쌓을까? : ");
		int n = stdIn.nextInt();
		
		for ( int i = 1 ; i <= n ; i++) {
			for ( int j = 1 ; j <= n-i ; j++)   // n-i 로 i행째에 표시할 공백 갯수 
				System.out.print(' ');
			
			for ( int j = 1 ; j <= (2*i) -1 ; j++)  //  2 * i -1 로 i행에 표시할 *의 갯수
				System.out.print('*');
			System.out.println();
		}
	}
}

