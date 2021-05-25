package portfolio;

public class StringNumCheck {

	public static void main(String[] args) {
		// 배열에 0 - 12 사이의 숫자가 존재하는지 검사
		
		
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
				System.out.println(i + " 값은 없습니다.");
			}
		}
		System.out.println("프로그램 끝");
	}

}
