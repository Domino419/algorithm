package Chap2;

import java.util.Random;
import java.util.Scanner;

public class RandomPlusMinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random() ;
		Scanner stdIn = new Scanner(System.in) ;
		
		System.out.println("정숫값");
		int x = stdIn.nextInt() ;
		
		System.out.println("입력 값의 범위는 ±5 범위의 난수를 생성했습니다~");
		System.out.println(" 값은  "+ (x - 5 + rand.nextInt(11))+"입니다");
		
		/** Random class mathod 
		rand.nextInt();  // true 또는 Flase 
		rand.nextInt(n) ;  // -2147483648~ +2147483646
		rand.nextLong() ;   // 0~N-1
		rand.nextDouble() ;  // -9223372036854775808 ~ +9223372036854775807
		rand.nextFloat() ;  //0.0 이상 1.0 미만 
		rand.nextBoolean() ;   // 0.0이상 1.0 미만 
		 */
		
	}
}
