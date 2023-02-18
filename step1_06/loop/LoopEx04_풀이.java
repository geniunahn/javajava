package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[3단계]
 * 
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 * 
 */

// 최단 기록 : 23년 2월 15일 6분 41초  /  총 도전 횟수 : 1
public class LoopEx04_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int score = 0;
		int answerCnt = 0;
		int i = 1;
		
		while (i <= 5) {
			
			int x = ran.nextInt(8) + 2; // 2~9
			int y = ran.nextInt(9) + 2;  // 2~10
			int answer = x * y;
			
			System.out.println(x + "X" + y + "=");
			int myAnswer = scan.nextInt();
			
			if (answer == myAnswer) {
				answerCnt++;
			}
			
			
			
			i++;
		}
		
		score = answerCnt * 20;
		System.out.println("성적 = " + score + "점");
		
		scan.close();

	}

}
