import java.util.Random;

public class Stopwatch {
	
	public static void main(String[] args)
	{
		int[] arr = new int[10000];
		Random random = new Random();
		for (int i = 0; i < arr.length; ++i)
		{
			arr[i] = random.nextInt();
		}
		
		Stopwatch StopwatchTest = new Stopwatch();
		
		StopwatchTest.start_timer();
		bubbleSort(arr);
		StopwatchTest.stop_timer();
		System.out.println("\nBubble sort execution time: " + StopwatchTest.getElapsed() + " milliseconds.");
	
	}
	
	public static void bubbleSort(int arr[])
	{	
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1])
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}
	
	private long startClock;
	private long endClock;
	
	public Stopwatch()
	{
		startClock = System.currentTimeMillis();
	}
	
	public long getStartClock()
	{
		return startClock;
	}
	
	public long getEndClock()
	{
		return endClock;
	}
	
	public void start_timer()
	{
		startClock = System.currentTimeMillis();
	}
	
	public void stop_timer()
	{
		endClock = System.currentTimeMillis();
	}
	
	public long getElapsed()
	{
		return (endClock - startClock);
	}
}
