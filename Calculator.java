package javaassignments;

public class Calculator {
	
	public static void main(String[] args) {
		Calculator calobj =new Calculator();
		int sum = calobj.addition(2, 3, 5) ;
				System.out.println(sum);
				System.out.println(calobj.subraction(5, 2));
				System.out.println(calobj.multiply(60d, 12d));
				System.out.println(calobj.division(5f, 3f) );
	}

	public int addition(int num1,int num2,int num3) {

		return (num1+num2+num3);
	}
	public int subraction(int num1,int num2) {

		return (num1-num2);

	} 
	public double multiply(Double num1,Double num2) {

		return (num1*num2);
	}
	public float division(float num1,float num2) {

		return (num1/num2);
	}
}