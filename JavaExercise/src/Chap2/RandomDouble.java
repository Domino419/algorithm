package Chap2;

import java.util.Random;

public class RandomDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random() ;
		
		double x1 = rand.nextDouble();
		double x2 = -1 - rand.nextDouble() * 10 ;
		double x3 = -1 + 2 * rand.nextDouble();

		System.out.println(" 3개의 난수를 생성햇습니다 ~ ");
		System.out.println(" 0.0 이상  1.0 미만 : " + x1);
		System.out.println(" 0.0 이상 10.0 미만 : " + x2);
		System.out.println("-1.0 이상  1.0 미만 : " + x3);
	}
 // double 형의 난수를 nextDouble() 메서드로 생성 한다. 
}
