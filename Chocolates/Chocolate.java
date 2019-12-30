
public class Chocolate {
	public static int chocolateEaten(int arr[][])
	{
		int rows = arr.length;
		if(rows == 0)
		{
			return 0;
		}
		int cols = arr[0].length;
		
		int start;
		int end = 0;
			
		if(rows % 2 == 1 && cols % 2 == 1)
		{
			start = rows / 2;
			end = cols / 2;
		}
		else if(rows % 2 == 1)
		{
			start = rows / 2;
			if(arr[start][cols/ 2 - 1] > arr[start][cols / 2])
			{
				start = cols / 2 - 1;
			}
			else
			{
				end = cols / 2;			
			}
		}
		else if (cols % 2 == 1)
		{
			end = cols / 2;
			if(arr[rows / 2 - 1][end] > arr[rows / 2][end])
			{
				start = rows / 2 - 1;
			}
			else
			{
				start = rows / 2;
			}
		}
		else
		{
			start = rows / 2 - 1;
			if(arr[start][cols / 2 - 1] > arr[start][cols / 2])
			{
				end = cols / 2 - 1;
			}
			else
			{
				end = cols / 2;
			}
			
			if(arr[rows / 2][cols / 2 - 1] > arr[start][end])
			{
				start = rows / 2;
				end = cols / 2 - 1;
			}
			if(arr[rows / 2][cols / 2] > arr[start][end])
			{
				start = rows / 2;
				end = cols / 2;
			}
		}
	
		int sum = arr[start][end];
		arr[start][end] = 0;
		
		while(true)
		{
			int path = getPath(start, end, arr);
			if(path == -1)
			{
				break;
			}
			if(path == 1)
			{
				start -= 1;
			}
			if(path == 2)
			{
				end -= 1;
			}
			if(path == 3)
			{
				start += 1;
			}
			if(path == 4)
			{
				end += 1;
			}
			
			sum += arr[start][end];
			arr[start][end] = 0;
		}
		
		return sum;
	}
	
	public static int getPath(int x, int y, int arr[][])
	{
		int max = 0;
		int path = -1;
		if (x > 0)
		{
			if(arr[x - 1][y] > max)
			{
				max = arr[x - 1][y];
				path = 1;
			}
		}
		if(x < arr.length - 1)
		{
			if(arr[x + 1][y] > max)
			{
				max = arr[x + 1][y];
				path = 3;
			}
		}
		if(y > 0)
		{
			if(arr[x][y - 1] > max)
			{
				max = arr[x][y - 1];
				path = 2;
			}
		}
		if(y < arr[x].length - 1)
		{
			if(arr[x][y + 1] > max)
			{
				max = arr[x][y + 1];
				path = 4;
			}
		}
		return path;
	}
	
	public static void main(String args[])
	{
		int arr[][] = 
			   {{6,8,9,7,4},
				{0,0,8,0,5},
				{5,7,4,5,10},
				{4,2,0,6,9}};
		
		System.out.println("Number of chocolates eaten is " + chocolateEaten(arr) + ".");
	}
	
}
