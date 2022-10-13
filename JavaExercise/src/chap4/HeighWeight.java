package chap4; // 4- 16
import java.util.Scanner;

/*
 * 신장별 표준 체중 대응표를 표시하는 프로그램을 작성하자. 표시할 신장의 범위 (시작값/종료값/증가값)은 정숫값으로 받을 것 
 * 표준 체중 = (신장 - 100) * 0.9
 */
public class HeighWeight {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in) ;
		System.out.println("몇 cm부터 : " ); 
		int hMin = stdIn.nextInt();

		System.out.println("몇 cm까지 : " ); 
		int hMax = stdIn.nextInt();
		
		System.out.println("몇 cm단위 : " ); 
		int step = stdIn.nextInt();
		
		System.out.println("신장 표준 체중 " ); 
		System.out.println("--------------------" ); 

		for(int i = hMin ; i <= hMax ; i+=step)
			System.out.println(i + " " + 0.9 * (i-100));
	}
}

