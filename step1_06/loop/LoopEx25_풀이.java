package step1_06.loop;

import java.util.Scanner;

/*
 * # 최대값 구하기[2단계]
 * 
 * 1. 3회 반복을 하면서 정수를 입력받는다.
 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
 * 
 */

//최단 기록 : 23년 2월 16일 2분 27초  /  총 도전 횟수 : 1
public class LoopEx25_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int heightNum = 0;
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("숫자 입력 : ");
			int myNum = scan.nextInt();
			
			if (myNum >= heightNum) {
				heightNum = myNum;
			}
		}
		
		System.out.println("가장 높은 정수 : " + heightNum);
		
		scan.close();
	}

}
