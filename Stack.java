package portfolio;

public class Stack 
{
	int DEF_SIZE = 5;
	
	private int [] mData;		// ����������.
	private int mPos;			// ��ġ����(Stack Pointer)
	private int mSize;			// �迭�� ũ��
	int count;
	
	// �⺻������ 
	Stack()
	{
		mData = new int[DEF_SIZE];
		mPos = -1;
		mSize = DEF_SIZE;
		
	}
	
	// �����ε��� ������
	Stack(int size)
	{
		mData = new int[size];
		mPos = -1;
		mSize = size;
		
	}
	
	// ���ÿ� �����͸� �ִ� �޼ҵ�
	boolean push(int data)
	{
		if (count < mSize) //
		{	
			mPos++;
			count++;
			mData[mPos] = data;
		}
		else
		{	
			return false;
		}
		
		return true;
		
		
	}
	
    // ���ÿ��� �����͸� ����
	boolean pop()
	{
		if (count == 0) // ������� Ȯ���ϴ� 
		{
			return false;
		}
	
		mData[mPos] = 0;
		mPos--;
		return true;	
	
	}
	
	// �����͸� ������ �´�.
	 boolean getData(int []ar) 
	 { 
		 if (mPos != -1) 
		 { 
			 ar[0] = mData[mPos]; 
			 return true; 
		 }
	  
		 return false;
	  
	  }
	 
	void printData()
	{
		for(int i = 0; i < mData[i]; i++)
		{	
			System.out.println(mData[i]);
		}	
	}

}
