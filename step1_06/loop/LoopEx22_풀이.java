package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # Up & Down 게임[2단계]
 * 
 * 1. 정답을 맞추면 게임은 종료된다.
 * 2. 100점부터 시작해 오답을 입력할 때마다 5점씩 차감된다.
 * 3. 게임 종료 후, 점수를 출력한다.
 * 
 */

// 최단 기록 : 23년 2월 16일 8분 29초  /  총 도전 횟수 : 1
public class LoopEx22_풀이 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int com = ran.nextInt(100) + 1;
		System.out.println("치트키 = " + com);
		
		int score = 100;
		int wrongAnswerCnt = 0;
		int minusPoint = 5;
		
		for (int i = 0; i < 20; i++) {
			
			System.out.println("숫자 입력[1~100] : ");
			int me = scan.nextInt();
			
			if (com > me) {
				System.out.println("Up!");
				wrongAnswerCnt++;
			}
			else if (com <me) {
				System.out.println("Down!");
				wrongAnswerCnt++;
			}
			else if (com == me) {
				System.out.println("Bingo");
				break;
			}
			
		}
		
		
		score = score - (minusPoint * wrongAnswerCnt);
		System.out.println("성적 " + score + "점");
		scan.close();
	}

}
