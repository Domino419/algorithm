package Chap2;

public class SumAve3A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, z; 
		
		x = 63 ;
		y = 18;
		z = 52 ;
		
		System.out.println("x값은 " + x+ "입니다.");
		System.out.println("y값은 " + y+ "입니다.");
		System.out.println("z값은 " + z+ "입니다.");
		System.out.println("합계는 " +( x+y+z) +"입니다.");
		System.out.println("평균은 " +(( x+y+z)/3) +"입니다.");

		
		
		// 세개의 변수 x, y, z의 평균을 표시하는 다른 방법 
		int sum = x+y+z ;
		System.out.println("x값은 " + x+ "입니다.");
		System.out.println("y값은 " + y+ "입니다.");
		System.out.println("z값은 " + z+ "입니다.");
		System.out.println("합계는 " +sum+"입니다.");
		System.out.println("평균은 " +(sum/3) +"입니다.");
		
	}

}
