package Chap2;

import java.util.Scanner;

public class Address {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in) ;
		
		System.out.println("주소 : ");
		String address = stdIn.nextLine() ;
		
		System.out.println("주소는 : " + address + "입니다.");

	}
/**
 * next()와 nextLine() 
 * 문자열을 읽기 위해서는 next 메서드를 사용한다. 
 * 단 next를 사용한 키보드 입력에선 공백 문자나 탭 문자가 문자열을 나누게 된다.
 * 성에 공백 문자를 입력해서 '홍 길동'이라고 입력하면 변수 lastName에는 '홍'이 저장되고
 * firstname에 '길동'이 저장된다. (이름을 입력할 수 없다) 
 * 공백 문자로 포함해서 한 줄의 입력을 문자열로 읽으려면 nextLine 메서드를 사용해야 한다.
 * Address 프로그램에서는 주소에 공백 문자라 포함될 가능성을 고려해서 nextLine()을 사용했다.
 * 
 * 들여쓰기 (indent) 
 * main 메서드 안에 작성하는 코드는 모두 왼쪽 끝을 맞추어 7번째 칸부터 시작한다.
 * {}는 코드를 하나릐 그룹으로 묶은 것으로 단락과 같으며 인덴트를 맞춰서 입력하면 구조를 파악하기 쉽다. 
 */
}
