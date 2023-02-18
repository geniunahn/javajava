package step1_06.loop;
/*
 * 
 *  # 반복문 while
 *  
 *  [ 형식 ]
 *  
 *  초기식;
 *  while ( 조건식 ) {
 *  
 *  	조건식이 참일동안 실행할 명령어;
 *  	증감식;	
 *  
 *  }
 * 
 * 	- 반복문의 조건 3가지
 * 		1) 초기식 : 조건식을 false로 바꾸기 위한 초깃값 셋업
 * 		2) 조건식 : 조건판별
 * 		3) 증감식 : 조건식을 false로 바꾸기 위한 증가,감소
 * 
 * */
public class LoopEx01 {

	public static void main(String[] args) {
		
		// while은 초기식, 조건식, 증감식 이 세 가지 요소로 구성된다. 구조는 아래와 같다.
		
		// 초기식의 변수 이름은 관례상 i로 한다.
		int i = 0;
		
		System.out.println("반복문 시작");
		// while의 조건식(소괄호) 자리에 i의 조건식을 입력한다.
		while (i < 10) {  
			System.out.println("명령어");
			i++; // 증감식
		}
		System.out.println("반복문 종료");

	}

}
