package sudas.study.example.zero;


public class Factorial {

	public static void main(String[] args) {
		Facto factorial = new Facto();
		int Facto = factorial.factorial(4);
		forfactorial factf = new forfactorial();
		
		int forfact=factf.factorial(3);
		
		System.out.println("FOR FACT "+forfact);
//		System.out.println(Facto);
	}

}

class Facto
{
	int n;
	//recursive method
	public int factorial (int n)
	{
		this.n=n;
	if (n==1)
		return 1;
	System.out.println("before "+n);	
	int factorial = factorial(n-1);
		System.out.println("after "+n);
		
		return factorial;
		
	}
	
}

class forfactorial
{
	int n;
	//recursive method
	public int factorial (int n)
	{
		this.n=n;
		int fact =1;
		for (int i=1;i<=n;i++)
		{
			fact= fact*i;
		}
		return fact;

	}

	
}
