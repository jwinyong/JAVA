package portfolio;

public class guGudan {

	public static void main(String[] args) {
		// 2�ܺ��� 9�ܱ��� ������ ����ϱ�

		// 1. 2-9���� ���� for�� �����
		// 1-1. 2, 3, 4, 5, ... 9 ������ ����
		// 2. 1-9���� ���� for�� �����
		// 2-2. 1,2,3,...9 ������ ����
		// 3. �� �� ���� ���� ���ؼ� ���!

		int dan = 1;
		int mul = 0;

		for (int i = 0; i < 8; i++) {
			dan++;

			System.out.println("--- " + dan + "�� ---");

			for (int k = 0; k < 9; k++) {
				mul++;

				System.out.println(dan + " x " + mul + " = " + (dan * mul));
			}
			mul = 0;
		}
	}

}
