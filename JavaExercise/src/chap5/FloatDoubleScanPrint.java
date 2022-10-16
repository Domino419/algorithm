package chap5;  // 5-3 

import java.util.Scanner;

/*
 * float 형 변수와 double형 변수에 값을 읽어서 표시하는 프로그램을 만들자 
 */

public class FloatDoubleScanPrint {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in) ;
		
		System.out.println("변수 x는 float형입니다. 변수 y는 double형입니다. ");
		System.out.println("변수 x :");
		float x = stdIn.nextFloat() ; // 약 6~7자리 
		
		System.out.println("변수  y :");
		double y = stdIn.nextDouble() ;   // 약 15자리 
		
		System.out.println("x = " + x);
		System.out.println("y = " + y );
		
//		System.out.printf("ABC\n");   // 그대로 표시 
//		System.out.printf("%d\n",  12345);  //10진수 
//		System.out.printf("%3d\n", 12345);  //적어도 3자리 
//		System.out.printf("%7d\n",  12345);  //적어도 7자리 
//		System.out.printf("%5d\n",  123);  //적어도 5자리 
//		System.out.printf("%05d\n", 123); //적어도 5자리 , 빈칸은 0으로 채운다.
//		
	}
}

