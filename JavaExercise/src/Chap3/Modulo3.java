package Chap3;
import java.util.Scanner;

public class Modulo3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in) ;
		
		System.out.println("정숫값:");
		int n = stdIn.nextInt() ;
		
		if (n>0)
			if(n % 3 == 0) 
				System.out.println("이 값은 3의 배수 ");
			else if(n%3 ==1)
				System.out.println("이 값을 3으로 나눈 나머지는 1입니다.");
		    else 
			    System.out.println("이 값을 3으로 나눈 나머지는 2입니다.");
		else
			System.out.println("음의 정숫값을 입력했습니다.");
	}
}
