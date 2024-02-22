
public class Forloop {

	public static void main(String[] args) {
		
	//Integer	
		for(int i=0;i<=10;i+=2)
		{
			System.out.println(i);
		}
		
	//Character
		for(char c='a';c<='z';c++)
		{
			System.out.println("Characters from c-->"+(byte)c);
		}
		
		for(char c='A';c<='Z';c++)
		{
			System.out.println("Characters from c-->"+(byte)c);
		}
		
	//double
		for (double i = 0.1; i <1.0; i += 0.1)
        {
            System.out.println("Value of i: " + i);
        }
		
	//float
		for (float j = 3.1f; j <= 4.0f; j += 0.1f) 
		{
            System.out.println("Value of j: " + j);
        }
		
	//short
		for (short k = 1; k <= 10; k++) 
		{
            System.out.println("Value of k: " + k);
		}
		
		
	//long
		for (long l = 1L; l <= 20L; l += 3)
		{
            System.out.println("Value of l: " + l);
		}
		
		
		
		

	}

}
