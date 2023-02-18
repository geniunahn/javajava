package step1_06.loop;


// # 삼각형 그리기

//최단 기록 : 23년 2월 18일 21분 13초  /  총 도전 횟수 : 1
public class LoopEx28_풀이 {
	
	public static void main(String[] args) {
		
		/*
		 * 예)
		 * ###
		 * ###
		 * ###
		 */
		
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.print("#");
//			}
//			System.out.println();
//		}
//		System.out.println();
		
		
		/*
		 * 문제 1) 증가 연산자로 할 것
		 * #
		 * ##
		 * ###
		 */
		
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("#");
//			}
//			System.out.println();
//		}


		
		/*
		 * 문제 2) 둘 다 증가 연산자로 할 것
		 *   #
		 *  ##
		 * ###
		 */
		
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3 - (i + 1); j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j <= i; j++) {
//				System.out.print("#");
//			}
//			System.out.println();
//		}
		

		
		/*
		 * 문제 3) 감소 연산자로 할 것
		 * ###
		 * ##
		 * #
		 */

//		for (int i = 0; i < 3; i++) {
//			for (int j = 3; j > i; j--) {
//				System.out.print("#");
//			}
//			System.out.println();
//		}

		
		/*
		 * 문제 4) 둘 다 감소 연산자로 할 것
		 * ###
		 *  ##
		 *   #
		 */
		
//		for (int i = 0; i < 3; i++) {
//			for (int j = 3; j > 3 - (i);  j--) {
//				System.out.print(" ");
//			}
//			for (int j = 3; j > i; j--) {
//				System.out.print("#");
//			}
//			System.out.println();
//		}


		
		/*
		 * 문제 5)  @는 증가  #은 감소 연산자로 할 것
		 * @##
		 * @@#
		 * @@@
		 */
		
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("@");
//			}
//			for (int j = 3; j > i + 1; j--) {
//				System.out.print("#");
//			}
//			System.out.println();
//		}
		


		
		/*
		 * 문제 6) 공백은 감소,  #은 증가 연산자로 할 것
		 *   #
		 *  ###
		 * #####
		 */
		
//		int k = 0;
//		for (int i = 0; i < 3; i++) {
//			for (int j = 3; j > i + 1; j--) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j <= k; j++) {
//				System.out.print("#");
//			}
//			System.out.println();
//			k += 2;
//		}

		

		/*
		 * 문제 7) 둘 다 증가 연산자로 할 것
		 *  #####
		 *   ###
		 *    #
		 */
		
//		int k = 0;
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < 5 - k; j++) {
//				System.out.print("#");
//			}
//			System.out.println();
//			k += 2;
//		}

		
		
	}
}
