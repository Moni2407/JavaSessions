package DemoClass;

public class JavaClass {

	int a=10;
	int age;
	String name;
	double salary;
	
	//Constructors
	
	
	void show()
	{
		System.out.println("Show");
	}
	//default constructor
	
	JavaClass()
	{
		System.out.println("This is Constructor");
	}
	
	//parameterized constructor
	
	JavaClass(String n,int a,double s)
	{
		name=n;
		age=a;
		salary=s;
		System.out.println("This is 3 parameterized constructor");
		System.out.println("The name is-->"+name);
		System.out.println("The age is-->"+a);
		System.out.println("The Salary is-->"+salary);
	}
	
	JavaClass(String n,int age)
	{
		System.out.println("This is Constructor");
		this.name=name;
		this.age=age;
		
		System.out.println("This is 2 parameterized constructor");
		System.out.println("The name is-->"+name);
		System.out.println("The age is-->"+a);
	}
	
	
	
	public static void main(String[] args) {
		JavaClass obj=new JavaClass();
		System.out.println(obj.name="Nucot");
		System.out.println(obj.age=25);
		System.out.println(obj.salary=123445.000);
		
		JavaClass obj1=new JavaClass("Modi",40,30000.0);
		JavaClass obj2=new JavaClass("Nucot",50);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
