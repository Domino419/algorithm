// 배열의 요솟값을 초기화 하며 배열 선언하기 

package chap02;
// 구성 자료형이 int인 배열 (구성 요솟수는 5: 배열 초기자에 의해 생성) 

public class IntArrayInit {

	public static void main(String[] args) {
		int [] a = { 1, 2 , 3, 4, 5 } ;  // 배열 초기자에 의해 생성 
		
		for (int i = 0 ; i< a.length ; i++) 
			System.out.println("a[" + i + "]=" + a[i] ) ;
	}

}


