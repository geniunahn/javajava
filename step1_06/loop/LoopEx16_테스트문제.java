package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # 택시
 * 
 * 1. 손님을 태워 목적지까지 이동하는 게임이다.
 * 2. -10~10 사이의 랜덤 숫자 2개를 저장해 목적지로 설정한다.
 * 3. 메뉴는 아래와 같다.
 * 		1) 방향설정 : 동(1)서(2)남(3)북(4)
 * 		2) 속도설정 : 1~3까지만 가능
 * 		3) 이동하기 : 설정된 방향으로 설정된 속도만큼 이동
 * 4. 거리 2칸 당 50원씩 추가되어 요금도 출력한다.
 * 예) 1(50) 2(50) 3(100) 4(100) ...
 * 
 * 
 * 
 */

//최단 기록 : 23년 2월 17일 35분 0초  /  총 도전 횟수 : 1
public class LoopEx16_테스트문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran  = new Random();
		
		// 목적지(destination)
		int desX = ran.nextInt(21) - 10;
		int desY = ran.nextInt(21) - 10;
		
		// 현재 위치
		int x = 0;
		int y = 0;
		
		// 방향(direction)
		int dir = 0;
		
		// 속도
		int speed = 0;
		
		// 요금
		int feeCtn = 0;
		int fee = 0;

		boolean isRun = true;
		
		while (isRun) {
			System.out.println("= 택시 =");
			System.out.println("목적지 : " + desX + "," + desY);
			System.out.println("현위치 : " + x + "," + y);
			if (dir >= 1 && dir <= 4) {
				if (dir == 1) {
					System.out.println("방   향 : 동");
				}
				else if (dir == 2) {
					System.out.println("방   향 : 서");
				}
				else if (dir == 3) {
					System.out.println("방   향 : 남");
				}
				else if (dir == 4) {
					System.out.println("방   향 : 북");
				}
			}
			else {
				System.out.println("방향을 정하지 않음");
			}
//			System.out.println("방   향 : " + dir);
			System.out.println("속   도 : " + speed);
			System.out.println("============");
			
			System.out.println("1.방향설정");
			System.out.println("2.속도설정");
			System.out.println("3.이동하기");
			
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();

			if (selectMenu == 1) {  // 방향설정
				System.out.println("동(1) 서(2) 남(3) 북(4) : ");
				int inputDir = scan.nextInt();
				if (inputDir >= 1 && inputDir <= 4) {
					dir = inputDir;
				}
				else {
					System.out.println("방향은 1부터 4까지만 입력 가능합니다.");
				}
			}
			else if (selectMenu == 2) {  // 속도설정
				if (dir != 0) {
					System.out.println("속도는 1부터 3까지 입력 가능 : ");
					int inputSpeed = scan.nextInt();
					if (inputSpeed >= 1 && inputSpeed <= 3) {
						speed = inputSpeed;
					}
					else {
						System.out.println("속도는 1부터 3까지 입력 가능합니다.");
					}
				}
				else {
					System.out.println("방향을 입력한 후 사용해주세요.");
				}
			}
			else if (selectMenu == 3) {  // 이동하기
				if (speed != 0) {
					if (dir == 1) { // 동
						x += speed;
						feeCtn += speed;
					} else if (dir == 2) { // 서
						x -= speed;
						feeCtn += speed;
					} else if (dir == 3) { // 남
						y -= speed;
						feeCtn += speed;
					} else { // 북
						y += speed;
						feeCtn += speed;
					}
				}
				else {
					System.out.println("방향과 속도를 입력한 후에 이용해주세요.");
				}
			}
			
			if (desX == x && desY == y) {  // 게임 종료
				System.out.println("목적지에 도착했습니다. 게임을 종료합니다.");
				isRun = false;
			}
			System.out.println();
		}
		
		if (feeCtn % 2 == 1) {
			feeCtn += 1;
		}
		feeCtn /= 2;
		fee = feeCtn * 50;
		System.out.println("요금 : " + fee);
		
		scan.close();

	}

}
