package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # 소수찾기[1단계]
 * 
 * 1. 소수란, 1과 자기자신으로만 나눠지는 수
 * 2. 예) 2, 3, 5, 7, 11, 13, ..
 * 3. 힌트
 * 1) 해당 숫자를 1부터 자기자신까지 나눈다.
 * 2) 나머지가 0일 때마다 카운트를 센다.
 * 3) 그 카운트 값이 2이면 소수이다.
 * 4) 6/1 6/2 6/3 6/4 6/5 6/6	cnt=4	소수x
 * 
 * 정수 한 개를 입력받아, 해당 숫자가 소수인지 아닌지 판별한다.
 * 
 */

//최단 기록 : 23년 2월 16일 4분 52초  /  총 도전 횟수 : 1
public class LoopEx23_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int minorityCnt = 0;
		
		System.out.println("숫자 입력 : ");
		int num = scan.nextInt();
		
		for(int i = 1; i <= num; i++) {

			if (num % i == 0) {
				minorityCnt++;
			}
		}
		
		if (minorityCnt == 2) {
			System.out.println(num + "는 소수입니다.");
		}
		else {
			System.out.println(num + "는 소수가 아닙니다.");
		}
		
		scan.close();
	}

}
