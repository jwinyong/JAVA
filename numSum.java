package portfolio;

public class numSum {

	public static void main(String[] args) {
		// 1���� 100���� ���̿� �ִ� �ڿ����� ���� ���Ͻÿ�

		// 1. 1 - 100 ���� ���� for�� �����
		// 2. 1,2,3,....100 ���� �����ϴ� ���� �� ����
		// 3. ������ ������ ���� ���� ���ϱ�

		int num = 0;

		for (int i = 1; i <= 100; i++) {
			num = num + i;

		}

		System.out.println("���� = " + num);
	
	}

}
