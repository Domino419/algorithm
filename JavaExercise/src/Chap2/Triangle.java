package Chap2;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in) ;
		
 		System.out.println("삼각형의 넓이를 구합니다.");
 		
 		System.out.println("밑변:");
		Double widht = stdIn.nextDouble() ;
		
		System.out.println("높이 : ");
		Double heigt = stdIn.nextDouble() ;
		
		// 넓이를 구해서 표시 
		System.out.println("넓이는 " + ((widht * heigt) / 2 )+ "입니다.");
	}
}
