package SDET_Day2;

public class VariablesDemo {

	public static void main(String[] args) {
	//int a;		//declaration
		//a=100;  	//assignment
		
	/*
	 int a=100; //declaration + assignment
	 System.out.println(a);//100
	 
	 a=200;
	 System.out.println(a);//200
	 */

		//Approach 1
		
		/*
		 int a=100;
		 int b=200;
		 int c=300;
		 
		 */  //if var belongs to diff datatype.
		
		//Approach 2
		
		/*int a,b,c;
		a=100;
		b=200;       
		c=300;
		*/    //only if var belongs to same datatype.
		
		//Approach 3
		
		int a=100,b=200,c=300; //only if var belongs to same datatype.
		System.out.println("the value of a is:" +a);//the value of a is:100
		System.out.println(a+" "+b+" "+c);// 100 200 300
		System.out.println("the sum of a and b is : "+a+b);//the sum of a and b is : 100200
	}

}
