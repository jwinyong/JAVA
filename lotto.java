package practice;

public class lotto 
{

	public static void main(String[] args) 
	{
		// �ζ� ��ȣ
		
		// 1. 6 �迭 �����
		// 2. 1- 45������ ���� ���� �����
		// 3. ���� ���ڸ� �迭�� �ֱ�
		// for���� �ƴ� while ���� Ȱ���ϰ�
		
		// 4. �ߺ����� ����
		// boolean �迭�� �̿��Ͽ� 
		
		int[] lt = new int[6];
		int rn;
		
		boolean check = false;

		int num = 0;
		
		while (num < lt.length) 
		{	
			rn = (int)(Math.random() * 44) + 1;
			
			for (int i = 0; i < 6; i++) 
			{
				if (rn == lt[i]) 
				{
					check = true;
					break;
				}
			}
			
			if (check == false) 
			{
				lt[num] = rn;
				num++;
			}
			else 
			{
				check = false;
			}
		}
		
		for (int i = 0; i < lt.length; i++) 
		{
			System.out.println(lt[i]);
		}
			
	}

}
