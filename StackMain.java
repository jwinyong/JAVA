package portfolio;

public class StackMain
{

	public static void main(String[] args) 
	{
		Stack s1 = new Stack();
		
		s1.push(7); //0
		s1.push(9); //1
		s1.push(4); //2
		s1.push(32); //3
		s1.push(32); //3
		
		s1.pop();
		
		s1.printData();
	}

}
