package Chap2;

public class sumAve1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		
		
		// 변수를 한번에 선언하기 
		// int x, y ;
		
		x = 63 ;
		y = 18;
		
		System.out.println("x값은 " + x+ "입니다.");
		System.out.println("y값은 " + y+ "입니다.");
		System.out.println("합계는 " +( x+y) +"입니다.");
		System.out.println("평균은 " +(( x+y) /2) + "입니다.");
		
		
		//변수 값 표시 
		System.out.println(x);  // 변수 x값 표시 (정수값)
		System.out.println("x");  // 문자인 x값 표시 (문자열)
	}

}

/**
 * 한 줄에 변수를 하나씩 선언하는 경우
 * 개별 선언에 대한 주석 처리가 용이 하다
 * 선언의 추가나 삭제가 용이하다.
 * 프로그램의 라인 수가 늘어난다.
 */


