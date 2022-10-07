package Chap3;
import java.util.Scanner;

public class Sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in) ;
		
		System.out.println("정숫값:");
		int n = stdIn.nextInt() ;
		
		if (n>0)
			System.out.println(" 값이 양수입니다.");
		else if (n<0) 
			System.out.println(" 값이 음수입니다.");
		else 
     	  	System.out.println(" 값이 0입니다.");
	}

}
