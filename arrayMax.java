public class arrayMax {

	public static void main(String[] args) {
		// 13, 19, 39, 22, 4���� �迭�� �����ϰ� �� ���� �� ���� ū ���� ���ϱ�� ��, ���� ū ���� ��ġ(�迭�ε���)�� ���Ͻÿ�

		// 1. ���� �迭�� �����ϱ�
		// 2. �迭 0~4���� ���� ���� ū ���� ������ �����ϱ�
		// 3. ���� ū ���� �ε����� ���ϱ�

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