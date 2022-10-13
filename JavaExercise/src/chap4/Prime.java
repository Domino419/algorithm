package chap4; // 4-25
import java.util.Scanner;

/*
 * 양의 정숫값을 읽어서 소수인지를 판정하는 프로그램을 작성하자.
 * 소수는 2이상 n미만인 수중 어떤 수로도 나누어 지지 않는 정숫값 n을 말한다.
 * (자기 자신과 1로만 나뉘는 수) 
 * */

public class Prime {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		do {
			System.out.println("첫번째 : '2' 이상의 정숫값을 입력하세요");
			n = stdIn.nextInt();
		} while (n < 2);

		int i;
		for (i = 2; i < n; i++)
			if (n % i == 0)
				break;

		if (i == n)
			System.out.println("1.소수 입니다~");
		else
			System.out.println("1.소수가 아닙니다~ ");
		
		// 또다른 방법으로...
		System.out.println("두번째 : '2' 이상의 정숫값을 입력하세요");
		int nn ; 
		
		do {
			System.out.println(" 2 이상의 정숫값을 입력하세요 ");
			nn = stdIn.nextInt();
		} while (nn < 2);
		
		int a = 0;
		for (int j = 1;j<= nn ; j++) {
			if(nn%j == 0) {
				a = a + 1;
			}
		}
		if (a == 2) {
			System.out.println("2.소수 입니다");
		}
		else {
			System.out.println("2.소수가 아닙니다~ ");
		}		
	}
}
