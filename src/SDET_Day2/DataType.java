package SDET_Day2;

public class DataType {

	
	//byte b=-129; //cannot convert from into to byte.
	//byte b=128; //cannot convert from into to byte.
	
	public static void main(String[] args) {
      
		//Numeric data type
		byte by=125;
		System.out.println(by);
		
		short s=3535;
		System.out.println(s);
		
		long l= 212233435688899L;
		System.out.println(l);
		
		//Decimal numbers 
		
		float item_price=15.5f;
		double db1=1234.4343412;
		
		char ch='A';
		char ch1='a';
		
		boolean b1=true;
		boolean b2=false;
		
		String sname="KAMALI";
		
	System.out.println("the value of float is :"+item_price+"  "+"the value of boolean is:"+b1+"the value of characteris :"+ch);
		
	System.out.println(sname);
	
      final int a=100;
      
      // a=200;//cannot be assigned as a has declared by final 
                 
        System.out.println(a);
	}

}
