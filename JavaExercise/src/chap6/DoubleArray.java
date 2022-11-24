package chap6;

/*
 * 자료형은 Double이고 요소 수가 5인 배열을 생성하고 
 * 이 배열의 모든 요소를 표시하는 프로그램을 작성하자.
 */
public class DoubleArray {

	public static void main(String[] args) {
		double[] a = new double[5] ;
		
		//모든 요소의 값을 표시하기 

		for(int i=0;i<a.length;i++){
			System.out.println("A["+ i+"] = " +a[i] );
		}
	}

}

