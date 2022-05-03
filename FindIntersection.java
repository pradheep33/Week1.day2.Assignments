package javaassignments;

public class FindIntersection {
	public static void main(String[] args) {
		int a[] = {5,2,6,4,1};
		
		int b[] = {1,2,8,4,9,7};
		
		for (int i = 0; i <a.length ;i++) {
			for(int j = 0; j<b.length ; j++) {
				if (a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
		}

	}
		
	}
	
	

