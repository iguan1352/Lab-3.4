
public class finalSorts {
	public static void main(String[] args)
	{
		int[] testList = {4, 5, 2, 6, -5};
		System.out.println(partition(testList, 0, testList.length));
		for(int i = 0; i < testList.length; i++)
		{
			System.out.println(testList[i]);
		}
	}
	public static int partition(int [] list1, int front, int back)
	{
		int pivot = front;
		for(int i = front; i < back; i++)
		{
			int swap;
			int swap2;
			if(list1[pivot] >= list1[i])
			{
				swap = list1[pivot];
				list1[pivot] = list1[i];
				list1[i] = swap;
				pivot = i;
			}
			for(int j = back; j < front; j--)
			{
				if(list1[pivot] <= list1[j])
				{
					swap2 = list1[pivot];
					list1[pivot] = list1[j];
					list1[j] = swap2;
					pivot = j;
				}
			}
		}
		return pivot;
	}
	
	public static void quickSort(int[] list1, int front, int back)
	{
		
	}
}
