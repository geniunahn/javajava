package step1_06.loop;

/*
 
 	(for문)
 
	# 문제1) 9의 배수중 십의 자리가 6인 첫번째 배수 출력
	# 답 : 63
	
	# 문제2) 8로 나누면 5가 남는수 중 150보다 적은수중에 가장 가까운수를 구하시요 ( 절대값 사용 x )
	# 답 149
	
	# 문제3) 50에서 100까지 자연수중에서 9의 배수는 모두 몇개입니까?
	# 답 6 (54,63,72,81,90,99)
	
	# 문제4) 28의 배수 중에서 가장 큰 세자리 수를 구하시요.
	# 답 980
	
	# 문제5) 8의 배수를 작은수부터 5개 출력
	# 답 : 0,8,16,24,32
	
*/

//최단 기록 : 23년 2월 18일 14분 35초  /  총 도전 횟수 : 1
public class LoopEx31_테스트문제 {

	public static void main(String[] args) {


//		# 문제1) 9의 배수중 십의 자리가 6인 첫번째 배수 출력
//		# 답 : 63
		System.out.println("9의 배수중 십의 자리가 6인 첫번째 배수 출력");
		int myNum1 = 70;

		for (int i = 1; i <= myNum1; i++) {
			if (i % 9 == 0) {
				int num10 = i / 10;
				if (num10 == 6) {
					System.out.println(i);
					break;
				}
			}
		}
		System.out.println();
		

//		# 문제2) 8로 나누면 5가 남는수 중 150보다 적은수중에 가장 가까운수를 구하시요 ( 절대값 사용 x )
//		# 답 149
		System.out.println("8로 나누면 5가 남는수 중 150보다 적은수중에 가장 가까운수를 구하시요");
		int myNum2 = 150;
		
		for (int i = myNum2; i > 0; i--) {
			if (i % 8 == 5 && i < 150) {
				System.out.println(i);
				break;
			}
		}
		System.out.println();
		
//		# 문제3) 50에서 100까지 자연수중에서 9의 배수는 모두 몇개입니까?
//		# 답 6 (54,63,72,81,90,99)
		System.out.println("50에서 100까지 자연수중에서 9의 배수는 모두 몇개입니까?");
		int myNum3 = 100;
		int count1 = 0;
		
		for (int i = 50; i < myNum3; i++) {
			if (i % 9 == 0) {
				count1++;
			}
		}
		System.out.println(count1 + "개");
		System.out.println();
		

//		# 문제4) 28의 배수 중에서 가장 큰 세자리 수를 구하시요.
//		# 답 980
		System.out.println("28의 배수 중에서 가장 큰 세자리 수를 구하시요");
		int myNum4 = 1000;
		int maxNum = 0;
		
		for (int i = 0; i < myNum4; i++) {
			if (i % 28 == 0) {
				if (maxNum < i) {
					maxNum = i;
				}
			}
		}
		System.out.println(maxNum);
		System.out.println();
		
//		# 문제5) 8의 배수를 작은수부터 5개 출력
//		# 답 : 0,8,16,24,32
		System.out.println("8의 배수를 작은수부터 5개 출력");
		int myNum5 = 100;
		int count2 = 0;
		
		for(int i = 0; i < myNum5; i++) {
			if (i % 8 == 0) {
				System.out.print(i + " ");
				count2++;
				if (count2 == 5) {
					break;
				}
			}
		}
		

	}

}
