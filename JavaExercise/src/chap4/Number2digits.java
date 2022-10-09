package chap4; // 4-3
//숫자 맞추기 게임 
import java.util.Random;
import java.util.Scanner;

public class Number2digits {
	public static void main(String[] args) {
		Random rand = new Random() ;
		Scanner stdIn = new Scanner(System.in) ;
		int no = 10 + rand.nextInt(90) ;  //맞춰야 하는 10~ 99의 난수를 생성 
		System.out.println("난수로 생성한 no 값 :" + no );
		
		System.out.println("숫자 맞추기 게임 시작~!  ");
		System.out.println("10부터 99 사이의 숫자를 맞추세요.");
		
		int x ;
		do {
			System.out.println("어떤 숫자 일까 ?  ");
			x= stdIn.nextInt() ;
			
		if (x > no) {
			System.out.println("입력한 숫자보다 더 작은 숫자입니다.");}
		//    System.out.println("더 작은 숫자입니다." + no );
		else if ( x < no)
	    	System.out.println("입력한 숫자보다 더 큰 숫자입니다.");
	    //	System.out.println("더 큰 숫자입니다." + no );
			
		} while (x != no ) ;
		System.out.println("정답입니다~");
	}
}

