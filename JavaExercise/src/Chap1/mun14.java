package Chap1;

public class mun14 {

	
	// 본인 이름을 한글자씩 표시하기 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-- 본인 이름을 한 줄에 한 글자씩 표시하기-벙법1");
		System.out.println("홍");
		System.out.println("길");
		System.out.println("동");
	
		System.out.println("-- 본인 이름을 한 줄에 한 글자씩 표시하기-방법2");
		System.out.println("홍\n길\n동\n");
		
		
		System.out.println("-- 빈 줄 출력하기 방법 --1");
		System.out.println("홍");
		System.out.println();
		System.out.println("길");
		System.out.println();
		System.out.println("동");
		
		System.out.println("-- 빈 줄 출력하기 --방법2");
		System.out.println("홍\n\n길\n\n동");
		
		
	}
	

}
//
// 자바는 객제치향 프로그램을 지원하는 언어이다. 자바 프로그램 개발에 사용하는 툴을 앞파벗 세글자로 JDK라고 한다.
//사람이 문자를 나열해서 작성하는 프로그램을 소스 프로그램 이라고 하며, 
//이것을 저장하는 파일에는 java라고 하는 확장자를 붙인다.
// 소스 프로그램은 바로 실행할 수 없으므로 컴파일 작업이 필요하며 
// 이때 필요한 것이 컴파일이라는 명령이다. 
// 컴파일의 결과로 생성되는 바이트코드를 저장하고 있는 파일을 클래스 파일이라고 하며, 확장자는 class이다, 
//생성된 파일 내에 담겨있는 클래스를 실행하려면 java 명령을 실행한다. 
//
//
//작성자를 포함해서 코드를 읽는 사람에게 전달하고 싶은 정보를 프로그램에 간단히 기술하는 것을 주석이라고 하며, 
//이것의 유무나 내용에 따라 프로그램 동작이 바뀌는 경우가 없다.전통적인 주석은 
///*과 */으로 감싸며 문서화 주석은 /** 과 **/로 감싼다. 두 방식 모두 시작기호와 종료 기호가 동일행 안에 위치 하지 않아도 된다., 
//'한줄 주석은 //부터 해당 줄의 마지막 까지가 주석이 된다. 이 형식은 여러줄에 걸쳐 사용할 수 없다.
//"abc"처럼 큰 따옴표로 감싸 문자들을 나열한 것을 리터럴이라고 한다. */
