package Chap2;

import java.util.Scanner;

public class PlusMinus10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in)  ;
		
		System.out.println("정숫값 : ");
		int x = stdIn.nextInt() ;
		
		System.out.println("10을 더한 값은 " + (x+10) + "입니다.");
		System.out.println("10을 뺀 값은 " + (x-10) + "입니다.");
		//stdIn.close();
		
		//LowesDigit 
		
       // Scanner LowesDigit = new Scanner(System.in)  ;
		
		System.out.println("정숫값 : ");
		int x2 = stdIn.nextInt() ;
		
		//int x = stdIn.nextLine()
		System.out.println("마지막 자릿수를 제외한 값은 " + (x2/10)+ "입니다.");
		System.out.println("마지막 자릿수는 " + (x2%10)+ "입니다.");
		stdIn.close();
		
	}
	
	
	
	
	/**
	 * Scanner 클래스의 next_메서드 
	 * nextBoolean : True 또는 False 
	 * nextByte :  -128~ +127 
	 * nextShort  : -32768~ +32767
	 * nextInt  : -2147483648 ~ + 2147483646
	 * nextLong  : ± 3.40282347E38 ~ +1.40239846E-45
	 * nextDouble  : 1.79769313486231507E+378 ~ ± 4.94065645841246544E-324
	 * next : 문자열(스페이스, 줄 바꿈 등으로 구분 가능) 
	 * nextLine : 한 줄의 문자열 
	 */

}
