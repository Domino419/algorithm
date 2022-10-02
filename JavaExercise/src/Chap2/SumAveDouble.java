package Chap2;

import java.util.Scanner;

public class SumAveDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in)  ;
		
		System.out.println("x값 : ");
		Double x = stdIn.nextDouble() ;   // 실수값을 받아서 x에 저장 한다. 
		
		
		System.out.println("y값 : ");
		Double y = stdIn.nextDouble() ;   // 실수값을 받아서 y에 저장 한다. 
		
		
		System.out.println("합계는 :  " + (x+y) + "입니다.");
		System.out.println("평균은 :  " + ((x+y)/2) + "입니다.");
		
		
		
	}
}
