package portfolio;

public class numSum {

	public static void main(String[] args) {
		// 1부터 100까지 사이에 있는 자연수의 합을 구하시오

		// 1. 1 - 100 까지 도는 for문 만들기
		// 2. 1,2,3,....100 으로 증가하는 변수 값 설정
		// 3. 설정한 변수를 더해 총합 구하기

		int num = 0;

		for (int i = 1; i <= 100; i++) {
			num = num + i;

		}

		System.out.println("총합 = " + num);
	
	}

}
