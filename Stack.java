package portfolio;

public class Stack 
{
	int DEF_SIZE = 5;
	
	private int [] mData;		// 스택프레임.
	private int mPos;			// 위치정보(Stack Pointer)
	private int mSize;			// 배열의 크기
	int count;
	
	// 기본생성자 
	Stack()
	{
		mData = new int[DEF_SIZE];
		mPos = -1;
		mSize = DEF_SIZE;
		
	}
	
	// 오버로딩된 생성자
	Stack(int size)
	{
		mData = new int[size];
		mPos = -1;
		mSize = size;
		
	}
	
	// 스택에 데이터를 넣는 메소드
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
	
    // 스택에서 데이터를 삭제
	boolean pop()
	{
		if (count == 0) // 비었는지 확인하는 
		{
			return false;
		}
	
		mData[mPos] = 0;
		mPos--;
		return true;	
	
	}
	
	// 데이터를 가지고 온다.
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
