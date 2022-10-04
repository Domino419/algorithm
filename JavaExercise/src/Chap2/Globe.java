package Chap2;

import java.util.Scanner;

public class Globe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in) ;
		final double PI = 3.1416 ;
		
		System.out.println("구의 겉넓이와 부피를 구합니다.");
		System.out.println("반지름 : ");
		Double r = stdIn.nextDouble() ; 
		
		System.out.println("겉넓이는 " + (4*PI * r * r) + "입니다");
		System.out.println("부피는 " + (4/3.0 * PI * r * r * r) + "입니다");

	}

}


// final 변수를 사용하는 경우 값의 관리를 한 곳에서 집중해서 할 수 있다.
// 프로그램의 가독성을 향상시킨다 
// final 변수는 원칙적으로 초기화 해야 한다. 선언시에 초기화하지 않은 final 변수는 한번만 값을 대입할 수 있다.  