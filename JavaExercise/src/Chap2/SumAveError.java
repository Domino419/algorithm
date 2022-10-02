package Chap2;

public class SumAveError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int x ;
		//int y ;
		
		double x ;
		double y ;
		
		x = 63.4;
		y = 18.3;
		
		System.out.println("x값은 " + x + "입니다.");   // x값 표시 
		System.out.println("y값은 " + y + "입니다.");    // y 값 표시 
		System.out.println("합계는 " +( x + y ) + "입니다.");   // 합계   
		System.out.println("평균은 " +(( x + y )/2 ) + "입니다.");   // 평균 
	}

	
	/**
	 * 자바에서 제공하는 대부분은 기본형(primitive type) 라고 하며 정수형, 실수형이 존재
	 * 실수형을 int로 받는 경우 자료 타입이 맞지 않아서 오류 
	 */
}


