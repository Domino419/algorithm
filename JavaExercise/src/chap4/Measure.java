package chap4; // 4- 18
import java.util.Scanner;

/*
 * 이볅한 정숫값의 모든 약수를 표시하자 
 */
public class Measure {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정숫값 ");
		int n = stdIn.nextInt();
		int count = 0 ; // 약수의 갯수를 담기 위한 변수 
		
		for(int i = 1 ; i <=n ; i++) 
			if ( n%i == 0) {  //약수는 나누어 떨어지는 수가 0인 것 
//				System.out.println(i + ""); 
				System.out.print(i + " "); 
				count++ ;
			}
		System.out.println(" \n의 약수는" + count + "개입니다.");
	}
}

