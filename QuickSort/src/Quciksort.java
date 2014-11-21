public class Quciksort {

	static int[] quicksort(int data[])
	{
		if(data.length<2)
			return data;
		//pick a middle element
		int mid=data.length/2;
		int pivotIndex=mid;
		int pivotValue=data[pivotIndex];
		int leftCount = 0;
		// Count how many are less than the pivot
		for( int i = 0; i < data.length; ++i ){
		if( data[ i ] <data[pivotIndex] ) ++leftCount;
		}
		int left[]=new int[leftCount];
		int right[]=new int[data.length-leftCount-1];
		int l=0;
		int r=0;
		
		for(int i=0;i<data.length;i++)
		{
			if(i==pivotIndex)
				continue;
			if(data[i]<data[pivotIndex])
				left[l++]=data[i];
			else
				right[r++]=data[i];
		}
		
		left=quicksort(left);
		right=quicksort(right);
		// Combine the sorted arrays and the pivot back into the original array
		System.arraycopy( left, 0, data, 0, left.length );
		data[ left.length ] = pivotValue;
		System.arraycopy( right, 0, data, left.length + 1, right.length );
		return data;
		
	}
	public static void main(String args[])

	{
		int a[]={2,5,3,4,6,1,6,8,2,5,7};
		Quciksort.quicksort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}