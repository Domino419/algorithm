package chap4; // 4- 19
import java.util.Scanner;

/*
 * 정숫값의 제곱을 표시 (방법1) 
 */
public class Square1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정숫값 A");
		int n = stdIn.nextInt();

		for(int i = 1 , j= 1 ; i <=n  ; i++, j = i*i ) 
		System.out.println(i +" 의 제곱은 " + j + "입니다.");
		
		System.out.println("정숫값 B");
		int t = stdIn.nextInt();
		for(int i = 1 ; i <=n  ; i++ ) 
			System.out.println(i +" 의 제곱은 " + i*i + "입니다.");
		
	}
}

