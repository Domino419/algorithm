package Chap2;

import java.util.Random;

public class RandomInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random() ;
		
		//난수를 생성하자 
		int n1 = 1 +rand.nextInt(9) ; // 0~8애서 1을 더한 1~9 
		int n2 = -1 -rand.nextInt(9) ;  // 0~8의 부호를 반대로 한 0~-8에 -1을 더한 -1~-9
		int n3 = 10 +rand.nextInt(90) ; // 0~89에 10을 더한 10~99

		System.out.println("3개의 난수를 생성했습니다.");
		System.out.println("한 자리의 양의 정수  :" +n1);
		System.out.println("한 자리의 음의 정수  :" + n2);
		System.out.println("두 자리의 양의 정수  :" + n3);

	}

}
