package chap4; // 4-30
import java.util.Random;
import java.util.Scanner;

/*
 *숫자 맞추기 게임( 0~ 99) 
 *숫자 맞추기 게임헤서 숫자의 범위를 0~99로 변경하고 플레이어가 입력할 수 있는 횟수를 제한 하도록 프로그램을 수정하다. 
 *제한 횟수내에 맞추지 못한 경우에는 정답을 표시하고 게임을 종료할 것 
 * */

public class FindNumber {
	public static void main(String[] args) {
		Random rand = new Random() ;
		Scanner stdIn = new Scanner(System.in) ;
		
		final int MAX_NO = 6 ; //최대 입력횟수는 변함업는 값이니까 final 선언 
		int leftNo = MAX_NO ;  // 남은 횟수 
		int no = rand.nextInt(100) ;  //맞춰야 하는 0~ 99의 난수를 생성 
		
		System.out.println("------- 난수로 생성한 no 값 :" + no );
		
		System.out.println("숫자 맞추기 게임 시작~!  ");
		System.out.println("10부터 99 사이의 숫자를 맞추세요.");
		
		int x ;   // 콘솔에서 입력받은 값 
		
		do {
			System.out.println("남은 횟수는   " + (leftNo--) + "회 입니다. ");
			System.out.println("숫자를 입력하세요 ");
			x= stdIn.nextInt() ;
			
		if (x > no) 
			System.out.println("입력한 숫자보다 더 작은 숫자입니다.");
		
		else if ( x < no)
	    	System.out.println("입력한 숫자보다 더 큰 숫자입니다.");
			
		} while (x != no && leftNo > 0) ;   //x가 no과 다르고 잔여횟수가 0보다 큰 경우에는 ..
		
		if (x == no)
			System.out.println("정답입니다. " + ( MAX_NO-leftNo ) + "회만에 맞췃습니다." );
		else 
			System.out.println("틀렷습니다. 정답은 " + no + "입니다.");
	}
}
