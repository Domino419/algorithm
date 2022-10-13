package chap4;

import java.util.Scanner;

/*
 * 달을 정숫값으로 읽어서 해당하는 달의 계절을 표시하는 프로그램을 작성하다. 
 * 원하는 만큼 입력 및 출력 할 수 있게 하며 1~12이외의 값이 입력된 경우에는 재입력 하도록 할 것 ( do문 안에 do문이 들어가는 이중 루프로 구성)
 */
public class SeaeonRepeat {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in) ;
		int retry ; 
		System.out.println("계절을 찾습니다. : ");
		do {
			int month ; //월을 저장 
			do {
				System.out.println("몇 월입니까? ; ");
				month = stdIn.nextInt() ;
			}while (month < 1 || month > 12) ;
			
			if(month >= 3 && month <= 5)  // 3.4.5
				System.out.println("봄~입니다.");   
			
			else if(month >= 6 && month <= 8)  // 6,7,8
				System.out.println("여름~입니다.");
			
			else if(month >= 9 && month <= 11)  //9,10,11
				System.out.println("가을~입니다.");
			
			else if(month == 12 || month == 1 || month == 1 )
				System.out.println("겨울~입니다.");
			
			System.out.println("다시 하시겠습니까? 1_Yes /  0_NO ");
			retry = stdIn.nextInt() ;
		}while (retry==1) ;
	}
}
