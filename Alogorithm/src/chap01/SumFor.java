package chap01;
import java.util.Scanner;
// 1.2 ...의 합을 구합니다. 

public class SumFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in) ;
		
		System.out.println("1부터 N까지의 합을 구합니다");
		System.out.println("N의 값 : ");
		int n = stdIn.nextInt() ;
		
		int sum = 0 ;
		
		for(int i = 1 ; i<= n ; i++) 
			sum += i ;
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다");

	}

}
