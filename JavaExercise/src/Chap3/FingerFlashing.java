package Chap3;
import java.util.Random;
import java.util.Scanner;

public class FingerFlashing {
	public static void main(String[] args) {
		Random rand = new Random () ;
		
		System.out.println("컴퓨터가 낸 것 ");
		int hand = rand.nextInt(3) ;
		
		switch(hand) {
		case 0 : System.out.println("가위");
		break ;
		case 1 : System.out.println("바위");
		break ;
		case 2 : System.out.println("보");
		break ;   // 코드를 추가하는 경우에 break를 적지 않아서 생기는 휴먼 에러를 방지하기 위해서 작성함
		
		}
	}
}
