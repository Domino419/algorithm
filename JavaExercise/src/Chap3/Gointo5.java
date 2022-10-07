package Chap3;
import java.util.Scanner;

public class Gointo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in) ;
		
		System.out.println("변수 a:");
		int a = stdIn.nextInt() ;
		
		System.out.println("변수 b:");
		int b = stdIn.nextInt() ;
		
		
		if (a>b)
			System.out.println("a가 크다");
		else if (a<b) 
			System.out.println("a가 작다.");
		else 
     	  	System.out.println("a와 b가 같다.");
	}

}
