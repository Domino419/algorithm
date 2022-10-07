package Chap3;
import java.util.Scanner;

public class Multipleof10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in) ;
		
		System.out.println("정숫값:");
		int a = stdIn.nextInt() ;
		
		if (a>0)
			if(a % 10 == 0) 
				System.out.println("이 값은 10의 배수 ");
			else 
				System.out.println("이 값은 10의 배수가 아닙니다.");
		else 
			System.out.println("음의 정숫값을 입력했습니다.");

	
	
	}

}
