import java.util.Scanner;

public class Hello {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, World !");
		Hello hello = new Hello();
		hello.enterNumbers();
	}
	
	private void enterNumbers()
	{
		int i = 33, j = 22, y;
		//Scanner scanner = new Scanner(System.in);
		//System.out.print("Enter First Number = ");
		//i = scanner.nextInt();
		//System.out.print("Enter Second Number = ");
		//j = scanner.nextInt();
		y = addNumbers(i,j);
		y = subtractNumbers(i,j);
		y = multipleNumbers(i,j);
		y = divisionNumbers(i,j);
	}
	
	public int addNumbers(int i, int j)
	{
		int z = i + j;
		System.out.println("Sum = "+z);
		return z;
	}
	
	public int subtractNumbers(int i, int j)
	{
		int z = i - j;
		System.out.println("Difference = "+z);
		return z;
	}
	
	public int multipleNumbers(int i, int j)
	{
		int z = i * j;
		System.out.println("Product = "+z);
		return z;
	}
	
	public int divisionNumbers(int i, int j)
	{
		int z = i / j;
		System.out.println("Division = "+z);
		return z;
	}

}
