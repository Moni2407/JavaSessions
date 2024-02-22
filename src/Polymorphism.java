
public class Polymorphism {
	
	void add(int a, int b)
	{
		int t1=a+b;
		System.out.println(t1);
	}
	
	void add(int a, int b, int c)
	{
		int t2=a+b+c;
		System.out.println(t2);
	}
	
	void add(int a, int b, int c, int d)
	{
		int t3=a+b+c+d;
		System.out.println(t3);
	}
	
	
	void add(int a, int b, int c, int d, int e)
	{
		int t4=a+b+c+d+e;
		System.out.println(t4);
		System.out.println("It is different example");
	}
	
	void add(int a, char b)
	{
		int t1=a+b;
		System.out.println(t1);
	}
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		Polymorphism obj=new Polymorphism();
		obj.add(10, 5);
		
		obj.add(15, 20);
		
		obj.add(15, 20, 30);
		
		
		obj.add(15, 20, 5, 29);
		
		System.out.println("It is different example");
		
		obj.add(15, 'b');
		
		
		
		
		
		
		

	}

}
