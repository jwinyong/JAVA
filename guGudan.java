package portfolio;

public class guGudan {

	public static void main(String[] args) {
		// 2단부터 9단까지 구구단 출력하기

		// 1. 2-9까지 도는 for문 만들기
		// 1-1. 2, 3, 4, 5, ... 9 변수값 설정
		// 2. 1-9까지 도는 for문 만들기
		// 2-2. 1,2,3,...9 변수값 설정
		// 3. 위 두 변수 값을 곱해서 출력!

		int dan = 1;
		int mul = 0;

		for (int i = 0; i < 8; i++) {
			dan++;

			System.out.println("--- " + dan + "단 ---");

			for (int k = 0; k < 9; k++) {
				mul++;

				System.out.println(dan + " x " + mul + " = " + (dan * mul));
			}
			mul = 0;
		}
	}

}
