package practice;

public class arrayReverse 
{

	public static void main(String[] args) 
	{
		// �迭�� �������� �����ϱ�

		// 1. �־��� ������ �迭 �����
		// 2. for���� �̿��Ͽ� �������� ����ϱ�
		// how? ���ο� ���� ũ���� �迭 �����
		// ���Ӱ� ���� �迭�� �������� ar3 �迭�� �ε��� ���ڸ� �ֱ�?

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
