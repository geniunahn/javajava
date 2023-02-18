package step1_06.loop;

import java.util.Scanner;

/*
 * # 소수찾기[2단계]
 * 
 * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
 * 예)
 * 입력 : 20
 * 2, 3, 5, 7, 11, 13, 17, 19
 * 
 */

//최단 기록 : 23년 2월 18일 4분 43초  /  총 도전 횟수 : 1
public class LoopEx29_풀이 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int myNum = scan.nextInt();
		int cnt = 0;
		
		for (int i = 2; i <= myNum; i++) {
			cnt = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}
			if (cnt == 2) {
				System.out.print(i + " ");
			}
		}
		
		
	}
	
}
