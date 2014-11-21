/*selection sort*/
public class sort {
	
	static int findmin(int data[],int start)
	{
		int i=start+1;
		int min=start;
		for(;i<data.length;i++)
		{
			if(data[i]<data[min])
				min=i;
		}
		return min;
	}
	
	static void swap(int data[],int index1,int index2)
	{
		int temp=0;
		temp=data[index1];
		data[index1]=data[index2];
		data[index2]=temp;
		
	}
	
	static void printArray(int data[])
	{
		System.out.println();
		for(int i=0;i<data.length;i++)
			System.out.print(data[i]+" ");
	}

	static void selectionSort(int data[])
	{
		int minIndex=-1;
			
			for(int j=0;j<data.length;j++)
			{
				minIndex=findmin(data,j);
				swap(data,j,minIndex);
				
				printArray(data);
			}
			
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2,5,3,4,6,1,6,8,2,5,7};
		sort.selectionSort(a);

	}

}
