package Pac;

public class variable {
	int age=10;
	static int staticvar=40;
	public void myMethod()
	{
		int localvar=4;
		System.out.println(localvar);
	}
	public static void main(String[] args) {
		Variable obj=new Variable();N
		obj.myMethod();
		System.out.println(staticvar);
		System.out.println(obj.age);
		int year=2025; //local variable can be declared inside main
		System.out.print(year);
		

	}

}
