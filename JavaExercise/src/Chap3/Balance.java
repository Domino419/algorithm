package Chap3;
import java.util.Scanner;

public class Balance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in) ;
		
		System.out.println("정숫값:");
		int a = stdIn.nextInt() ;
		
		if (a>0)
			if(a % 5 == 0) 
				System.out.println("이 값은 5의 배수 ");
			else 
				System.out.println("이 값은 5로 나누어지지 않습니다.");
		else 
			System.out.println("음의 정숫값을 입력했습니다.");

	
	
	}

}
