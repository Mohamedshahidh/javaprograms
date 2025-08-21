package Pac;

public class Autoboxing {

	public static void main(String[] args) {
      //byte Byte
	  //long Long
	  //short Short
	  //int Integer
	  //char Character
		
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		
		float f=50.0f
	    double d=60.0D
	    
	    
	    char c='a';
		boolean b2=true;
		
		//autoboxing: converting primitive data type into objects
		Byte byteobj=b; //creating obj for particular variables
		Short shortobj=s;
		Integer intobj=i;
		Long longobj=l;
		Float floatobj=f;
		Double doubleobj=d;
		Character charobj=c;
		Boolean booleanobj=b2;
		
		//printing objects
		System.out.println("__printing object values");
		System.out.println("Byte object :"+byteobj);
		System.out.println("short object :"+shortobj);
		System.out.println("integer object :"+intobj);
		System.out.println("long object :"+longobj);
		System.out.println("float object :"+doubleobj);
		System.out.println("double object :"+charobj);
		System.out.println("character object :"+charobj);
		System.out.println("boolean object :"+booleanobj);
		
		//unboxing converting object to primitive data types
		
		Byte b1=bytesobj1;//creating obj for particular variable
		Short s1=shortobj1;
		System.out.println("byte object :"+b1);
		System.out.println("short object :"+s1);
		

	}

}
