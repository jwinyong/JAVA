package practice;

public class arrayReverse 
{

	public static void main(String[] args) 
	{
		// 배열을 역순으로 저장하기

		// 1. 주어진 값으로 배열 만들기
		// 2. for문을 이용하여 역순으로 출력하기
		// how? 새로운 같은 크기의 배열 만들기
		// 새롭게 만든 배열에 역순으로 ar3 배열의 인덱스 숫자를 넣기?

		int[] ar3 = new int[] { 11, 13, 32, 77, 5 };
		int[] target = new int[5];
		int targetIndex = 0;
		int ar3Index = 4;

		for (int i = 0; i < ar3.length; i++) 
		{
			target[targetIndex] = ar3[ar3Index];
			targetIndex++;
			ar3Index--;

			System.out.println(target[i]);

		}

	}

}
