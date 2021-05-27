package quiz;

public class Queue 
{
	final int DEF_SIZE = 10;
	private int mSize;  // 큐사이즈
	private int[] mData; // 데이터 저장배열
	private int mCount; // 현재 데이터 개수
	
	private int mFront; //  큐 머리
	private int mRear; // 큐 뒤
	
	
	// 생성자 초기화하기
	Queue(int size) 
	{
		mSize = size;
		mData = new int[size];
		mCount = 0;
		
		mFront = 0;
		mRear = 0;
		
	}
	
	// 큐가 꽉 찼는지 확인한다
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
	
	// 큐가 비었는지 확인한다
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
	
	
	// 데이터를 큐에 넣는다
	public boolean put(int data) 
	{
		if (true == isFull()) 
		{
			return false;
		}

		mData[mRear] = data;
		mRear = (mRear + 1) % mSize; // 리어를 증가시키면서 끝으로 가면 다시 0으로 돌와야
	
		mCount++;
		return true;
	}
	
	// pop만 한다
	public boolean pop() 
	{
		if (true == isEmpty()) 
		{
			return false;
		}
		
		mFront = (mFront + 1) % mSize; // 리어와 똑같은 메커니즘
		
		mCount--;
		return true;
	}
	
	// 데이터를 가져오고 팝하기
	public boolean get(int[] ar) 
	{
		if (true == isEmpty()) 
		{
			return false;
		}
		
		ar[0] = mData[mFront];
		mFront = (mFront + 1) % mSize; // 리어와 똑같은 메커니즘
		
		mCount--;
		return true;
	}
	
	
	// 큐의 데이터를 출력한다
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
