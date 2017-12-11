
public class finalSorts {
	public static void main(String[] args)
	{
		// partition test case
		/*int[] testList = {-10, 700, 4, 5, 2, 6, -5};
		System.out.println(partition(testList, 0, testList.length));
		for(int i = 0; i < testList.length; i++)
		{
			System.out.println(testList[i]);
		}*/
		
		//quickSort test case
		int[] testList = {-10, 700, 4, 5, 2, 6, -5};
		quickSort(testList, 0, testList.length);
		for(int i = 0; i < testList.length; i++)
		{
			System.out.println(testList[i]);
		}
	}
	public static int partition(int [] list1, int front, int back)
	{
		int pivot = (back + front)/2;
		boolean sorted = false;
		while(!sorted)
		{
			sorted = true;
			for(int i = front; i < back; i++)
			{
				int swap;
				if(list1[pivot] <= list1[i] && pivot > i)
				{
					swap = list1[pivot];
					list1[pivot] = list1[i];
					list1[i] = swap;
					pivot = i;
					sorted = false;
				}
				if(list1[pivot] >= list1[i] && pivot < i)
				{
					swap = list1[pivot];
					list1[pivot] = list1[i];
					list1[i] = swap;
					pivot = i;
					sorted = false;
				}
			}
		}
		return pivot;
	}
	
	public static void quickSort(int[] list1, int front, int back)
	{
		if(front != back)
		{
			int piv = partition(list1, front, back);
			partition(list1, front, piv);
			partition(list1, piv, back);
		}
	}
	
	public static void shellSort(int[] list1)
	{
		
	}
}
