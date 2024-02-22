
public class MethodOverloading {
	
 int a=10;
 static int b=100;
 
 void show()
 {
	 
 }
	
 static void test()
	{
		System.out.println("test");
	}	
	

	static void test(int t1)
	{
		System.out.println("test1");
	}
	
	static void test(int t1, int t2)
	{
		System.out.println("test2");
	}
	
	
	static void test(int t1, int t2, int t3)
	{
		System.out.println("test3");
	}
	
	
	static void test(int t1, int t2, int t3, int t4)
	{
		System.out.println("test4");
	}
	
	static void display()
	{
		System.out.println("Display");
	}
	
	
	static void display(String name)
	{
		System.out.println("Display"+name);
	}
	


	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		System.out.println(obj.a);
		obj.show();
		
		test(10);
		test();
		
		MethodOverloading.test(10); 
		MethodOverloading.test(); 
		
	}

}
