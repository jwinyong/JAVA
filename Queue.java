package quiz;

public class Queue 
{
	final int DEF_SIZE = 10;
	private int mSize;  // ť������
	private int[] mData; // ������ ����迭
	private int mCount; // ���� ������ ����
	
	private int mFront; //  ť �Ӹ�
	private int mRear; // ť ��
	
	
	// ������ �ʱ�ȭ�ϱ�
	Queue(int size) 
	{
		mSize = size;
		mData = new int[size];
		mCount = 0;
		
		mFront = 0;
		mRear = 0;
		
	}
	
	// ť�� �� á���� Ȯ���Ѵ�
	private boolean isFull()
	{
		if(mCount == mSize) 
		{
			return true;			
		}
		else 
		{
			return false;
		}
	}
	
	// ť�� ������� Ȯ���Ѵ�
	private boolean isEmpty()
	{
		if(mCount == 0) 
		{
			return true;			
		}
		else 
		{
			return false;
		}
	}
	
	
	// �����͸� ť�� �ִ´�
	public boolean put(int data) 
	{
		if (true == isFull()) 
		{
			return false;
		}

		mData[mRear] = data;
		mRear = (mRear + 1) % mSize; // ��� ������Ű�鼭 ������ ���� �ٽ� 0���� ���;�
	
		mCount++;
		return true;
	}
	
	// pop�� �Ѵ�
	public boolean pop() 
	{
		if (true == isEmpty()) 
		{
			return false;
		}
		
		mFront = (mFront + 1) % mSize; // ����� �Ȱ��� ��Ŀ����
		
		mCount--;
		return true;
	}
	
	// �����͸� �������� ���ϱ�
	public boolean get(int[] ar) 
	{
		if (true == isEmpty()) 
		{
			return false;
		}
		
		ar[0] = mData[mFront];
		mFront = (mFront + 1) % mSize; // ����� �Ȱ��� ��Ŀ����
		
		mCount--;
		return true;
	}
	
	
	// ť�� �����͸� ����Ѵ�
	public void printCQ() 
	{
		int k;
		
		k = mFront;
		
		for (int i = 0; i < mCount; i++) 
		{
			
			System.out.println(mData[k]);
			
			k = (k + 1) % mSize;
			
					
		}
	}
}
