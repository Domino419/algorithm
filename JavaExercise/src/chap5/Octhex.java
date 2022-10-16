package chap5;

import java.util.Scanner;

/*
 * 10진 정수를 읽어서 8진수, 16진수로 표시 
 */

public class Octhex {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in) ;
		
		System.out.println("정수 : ");
		int x = stdIn.nextInt() ;
		//방법 1
		System.out.printf(" 8진수는 %o입니다. \n" , x);
		System.out.printf(" 16진수는 %x입니다. \n" , x);
		
		// 방법 2 
		System.out.printf("8진수는 %o이고 16진수는 %x입니다 \n" , x, x);
		
		//방법 3 
		System.out.printf("ABC\n");   // 그대로 표시 
		System.out.printf("%d\n",  12345);  //10진수 
		System.out.printf("%3d\n", 12345);  //적어도 3자리 
		System.out.printf("%7d\n",  12345);  //적어도 7자리 
		System.out.printf("%5d\n",  123);  //적어도 5자리 
		System.out.printf("%05d\n", 123); //적어도 5자리 , 빈칸은 0으로 채운다.
		
	}
}

