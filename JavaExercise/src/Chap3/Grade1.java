package Chap3;
import java.util.Scanner;

public class Grade1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in) ;
		
		System.out.println("점수:");
		int point = stdIn.nextInt() ;
		
		
		
		if (point< 0 || point > 100) 
			System.out.println("점수를 다시 입력하세요");

		else if (point<= 49)  
			System.out.println("--가--");
		else if (point<= 59)
			System.out.println("--양--");
		else if (point<= 69)
			System.out.println("--미--");
		else if (point<= 79) 
			System.out.println("--우--");
		else if (point<= 79)
			System.out.println("--우--");
		else 
			System.out.println("--수--");
	}
}
