
public class quickSort2 {

	public static void sort(int data[],int low,int high)
	{
		int pivot=0;
		if(high>low)
		{
			pivot=Partition(data,low,high);
			sort(data,low,pivot-1);
			sort(data,pivot+1,high);
			
		}
		
	}
	
	public static int Partition(int data[],int low,int high)
	{
		int left,right;
		left=low;
		right=high;
		int pivotVal=data[low];
		while(left<right)
		{
			while(left<data.length&&data[left]<=pivotVal)
				left++;
			while(right>=0&&data[right]>pivotVal)
				right--;
			if(left<right)
			{
				System.out.println("Exchanging"+data[left]+data[right]);
				int temp=data[right];
				data[right]=data[left];
				data[left]=temp;
			}
		}
		System.out.println("LAst value of data right "+data[right]+" "+data[low]);
		data[low]=data[right];
		data[right]=pivotVal;
		return right;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2,5,3,4,6,1,6,8,2,5,7};
		quickSort2.sort(a,0,a.length-1);
		/*for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/

	}

}
