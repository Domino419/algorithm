package chap4; // 4- 17
import java.util.Scanner;

/*
 * 읽은 갯수만큼 *을 표시하는 문제 4-11을 변경해서 5개 단위로 줄 바꿈해서 표시하는 프로그램을 작성하자.
 */
public class putAxterisk5A {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in) ;
		System.out.println("몇 개의 *을 표시할까요?" ); 
		int n = stdIn.nextInt() ;
		
		if ( n > 0 ) { 
			for(int i = 0 ;   i <n ; i++) {
				System.out.print('*');
			if(i % 5 ==4) 
				System.out.println();
		}
		if(n%5 != 0 )
			System.out.println();  // 마지막에서 개행처리 
	}
  }
}


