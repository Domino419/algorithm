package chap01;
// 3개의 정숫값 가운데 최댓값을 구하여 출력합니다.

public class Max3m {
 // a,b,c의 최댓값을 구하여 반한홥니다.
	
	static int max3(int a, int b, int c) {
		int max = a ;
		if( b>max ) 
			max = b ;
		if (c>max)
			max = c ;
		
		return max ;
	}
	public static void main(String [] args) {
		System.out.println("max (3,2,1) = " + max3(3,2,1));   // [a] a>b>c
		System.out.println("max (3,2,2) = " + max3(3,2,2));   // [b] a>b=c
		System.out.println("max (3,1,1) = " + max3(3,1,1));   // [c] a>c>b
		System.out.println("max (3,2,3) = " + max3(3,2,3));   // [d] a=c>b
		System.out.println("max (2,1,3) = " + max3(2,1,3));   // [e] a>b>c
		System.out.println("max (3,3,2) = " + max3(3,3,2));   // [f] a>b>c
		System.out.println("max (3,3,3) = " + max3(3,3,3));   // [g] a>b>c
		System.out.println("max (2,2,3) = " + max3(2,2,3));   // [h] a>b>c
		System.out.println("max (2,3,1) = " + max3(2,3,1));   // [i] a>b>c
		System.out.println("max (2,3,2) = " + max3(2,3,2));   // [j] a>b>c
		System.out.println("max (1,3,2) = " + max3(1,3,2));   // [k] a>b>c
		System.out.println("max (2,3,3) = " + max3(2,3,3));   // [l] a>b>c
		System.out.println("max (1,2,3) = " + max3(1,2,3));   // [m] a>b>c
	}
}
