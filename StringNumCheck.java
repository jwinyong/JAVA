package portfolio;

public class StringNumCheck {

	public static void main(String[] args) {
		// �迭�� 0 - 12 ������ ���ڰ� �����ϴ��� �˻�
		
		
		int[] arTarget = new int[20];
		int rn;
		int target_value;
		
		boolean[] arTable = new boolean[13];
		
		for (int i = 0; i < arTable.length; i++) {
			arTable[i] = false;
		}
		
		for (int i = 0; i < arTarget.length; i++) {
			rn = (int)(Math.random() * 12);
			arTarget[i] = rn;
		}
		
		for (int i = 0; i < arTarget.length; i++) {
			target_value = arTarget[i];
			arTable[target_value] = true;
		}
		
		for (int i = 0; i < arTable.length; i++) {
			if(arTable[i] == false) {
				System.out.println(i + " ���� �����ϴ�.");
			}
		}
		System.out.println("���α׷� ��");
	}

}
