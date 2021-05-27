

package quiz;

public class QueueEx {

	public static void main(String[] args)
	{
		Queue cq = new Queue(6);
		boolean res = false;
		
		res = cq.put(10);
		res = cq.put(20);
		res = cq.put(30);
		res = cq.put(40);
		res = cq.put(50);
		res = cq.put(60);

		res = cq.pop();
		res = cq.pop();
		
		cq.printCQ();
	}

}
