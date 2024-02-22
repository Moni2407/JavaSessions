
public class Student 

	 {
		String name="abc";
		int age=25;
		char gender='m';
		int usn=123;
		String city="Banglore";
		String country;
		
		void add1()
		{
			int a=10;
			int b=40;
			int sum=a+b;
			System.out.println(sum);
		}
		
		void add(int aa, int bb)
		{
			int sum1=aa+bb;
			return sum1;
			}
		
		int add()
		{
			int aaa=10;
			int bbb=20;
			int sum11=aaa+bbb;
		}
		
		
		
		public static void main(String[] args) {
			Student obj1=new Student();
			System.out.println("The name is-->"+obj1.name);
			System.out.println("The age is-->"+obj1.age);
			System.out.println("The gender is-->"+obj1.gender);
			System.out.println("The city is-->"+obj1.city);
			System.out.println("The usn is-->"+obj1.usn);
			
			System.out.println(obj1.country="India");
			Classdemo obj1=new Classdemo();
			obj1.add();
			
			obj1.add(10,5);
			int result=obj1.add(10,5);
			System.out.println("result");
			
			
			
			
			
			
			
			
		}
		
	}


