package chap4; // 4-29
import java.util.Scanner;

/*
 *5개의 정수로 구성된 그룹의 전체 합계 (그룹별이 아닌 전체 그룹의 합)을 구하는 프로그램을 작성하자.
 *전체 10개의 그룹이 있으며 각 정숫값은 키보드를 통해서 입력한다.
 *단 99999를 입력하면 전체 입력을 종료하고 88888을 입력하면 현재 읽고 있는 그룹의 입력을 종료할 것 
 * */

public class SumGroup2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 더합시다. ");
		int total = 0 ;   // 전체 그룹의 합 
		
		outer :
			for( int i = 1 ; i <=10 ; i++) {   // i의 그룹갯수는 10개 
				System.out.println(  i + "그룹");
				
				for ( int j = 0 ; j < 5 ; j++) {   // 5개의 정수로 지정 
					System.out.println(+ j +"번째 정수 : ");
					int t = stdIn.nextInt() ; 
					if( t == 99999) 
						break outer ;  // 99999를 입력하면 outer 라벨의 입력을 종료함 
					else if (t == 88888) 
						continue outer ;   // 88888을 입력하면 해당 그룹의 입력을 종료하고 outer 라벨의 처음으로 돌아감.
					total += t ; 
				}
				System.out.println("----" + i +"번째 for문 진행 중----");
			}
		System.out.println("\n 합계는 " + total +"입니다.");
	}
}
