package javaassignments;



public class MissingElementsInArray {
	public static void main(String[] args) {
		
		int a[]= {1,2,4,5,6};
		//sum1=1+2+4+5+6
		//sum2=1+2+3+4+5+6
		//sum2-sum1
		int sum1=0;
		for(int i=0;i <a.length;i++)
		{
			sum1=sum1+a[i];
		
		}
		System.out.println("sum of array is "+sum1);
		int sum2=0;
		for(int i=0;i <=6 ;i++)
		{
			sum2=sum2+i;
		
		}
		System.out.println("sum of array is "+sum2);
		System.out.println("Missing number is "+(sum2-sum1));
	}

}
