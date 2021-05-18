public class arrayMax {

	public static void main(String[] args) {
		// 13, 19, 39, 22, 4값을 배열에 저장하고 이 값들 중 가장 큰 값을 구하기오 또, 가장 큰 값의 위치(배열인덱스)를 구하시오

		// 1. 값을 배열에 저장하기
		// 2. 배열 0~4까지 돌며 가장 큰 값을 변수에 저장하기
		// 3. 가장 큰 값의 인덱스를 구하기

		int[] ar1 = new int[] { 13, 19, 39, 22, 4, 99 };
		int max_index = 0;
		int max_value = ar1[0];

		for (int i = 0; i < ar1.length; i++) {
			if (ar1[i] > max_value) {
				max_value = ar1[i];
				max_index = i;
			}

		}
		System.out.println("Max Value = " + max_value);
		System.out.println("Max Index = " + max_index);
	}
}