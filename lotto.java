package practice;

public class lotto 
{

	public static void main(String[] args) 
	{
		// 로또 번호
		
		// 1. 6 배열 만들기
		// 2. 1- 45까지의 임의 숫자 만들기
		// 3. 만든 숫자를 배열에 넣기
		// for문이 아닌 while 문을 활용하고
		
		// 4. 중복값은 빼기
		// boolean 배열을 이용하여 
		
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
