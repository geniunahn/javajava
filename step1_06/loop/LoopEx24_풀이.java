package step1_06.loop;

import java.util.Random;

/*
 * # 랜덤학생
 * 
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 * 
 */

//최단 기록 : 23년 2월 16일 7분 10초  /  총 도전 횟수 : 1
public class LoopEx24_풀이 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int totalScore = 0;
		int passCnt = 0;
		int bestScore = 0;
		int bestStudentNum = 0;
		int scoreAvg = 0;
		int totalStudent = 10;
		
		for (int i = 1; i < totalStudent; i++) {
			int rNum = ran.nextInt(100) + 1;
			totalScore += rNum;
			
			if (rNum >= 60) {
				passCnt++;
			}
			
			if (rNum >= bestScore) {
				bestScore = rNum;
				bestStudentNum = i;
			}
		}
		
		scoreAvg = totalScore / totalStudent;
		
		System.out.println("전교생 총점 : " + totalScore);
		System.out.println("전교생 평균 : " + scoreAvg);
		System.out.println("합격자 수 : " + passCnt);
		System.out.println("최고의 점수 : " + bestScore);
		System.out.println("최고의 학생 번호 : " + bestStudentNum);
		

	}

}
