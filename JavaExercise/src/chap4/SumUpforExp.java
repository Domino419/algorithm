package chap4; // 4- 15
import java.util.Scanner;

/*
 * 1부터 n까지의 합 구하기 (계산식을 표시)
 */
public class SumUpforExp {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in) ;
		System.out.println("1부터 N까지의 합을 구합시다.." ); 
		int n ;
		do {
			System.out.println("N의 값 ");
			n  = stdIn.nextInt() ;
		}while (n <=0) ;
		int sum = 0 ;

		for(int i = 1 ; i < n ; i++) {
			System.out.print(i + "+");
			sum += i ;
        	}
		    System.out.print(n + "=");
		    sum += n ;
		    System.out.println(sum);
	}
}

