import java.util.Arrays;

public class SortingAlgorithms {

	public static void main(String[] args) {
		int[] arr = {6,4,2,23,6,5,9,7};
		SortingAlgorithms obj = new SortingAlgorithms();
		System.out.println("After Bubble sort : " +Arrays.toString(obj.bubbleSort(arr)));
		System.out.println("After Selection sort : " +Arrays.toString(obj.selectionSort(arr)));
		System.out.println("After insertion sort : " +Arrays.toString(obj.insertionSort(arr)));
		System.out.println("After linearSearch, postion is at index : " +obj.linearSearch(arr,9));
		System.out.println("After binarySearch, postion is at index : " +obj.binarySearch(arr,4));
	}
	public int[] bubbleSort(int[] arr)
	{
		int temp =0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	public int[] selectionSort(int[] arr)
	{
		int[] b = new int[arr.length];
		int min=0;
		for(int j=0;j<arr.length;j++)
		{
			min =arr[j];
		for(int i =j;i<arr.length;i++)
		{
			 if(arr[i]<min)
			 {
				 min = arr[i];
			 }
		}
		b[j]=min;
		}
		return b;
	}
	
	public int[] insertionSort(int[] arr)
	{
		int temp,j;
		for(int i =1;i<arr.length;i++)
		{
			j=i-1;
			while(arr[i]<arr[j] && (j)>=0)
			{
				temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				j--;
			}
		}
		return arr;
	}

	public int linearSearch(int[] arr, int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				return i;
			}
		}
		return -1;
	}
	public int binarySearch(int[] arr,int target)
	{
		
		Arrays.sort(arr);
		int first=0,last=arr.length-1;
		int middle = (first+last)/2;
		while(first<last)
		{
			if(arr[middle]<target)
			{
				first = middle+1;
				
			}
			else if(arr[middle]>target)
			{
				last = middle-1;
			}
			else {return middle;}
			
			middle = (first+last)/2;
		}
		
		return -1;
	}

}







