import java.util.Scanner;
public class Option {
	
	int s1,s2;
	public void showMenu() 
	{
		int m_num;
		
		System.out.println("1. Add two integers");
		System.out.println("2. SubStrac an integer from an interger");
		System.out.println("3. Multiply two integers");
		System.out.println("4 .Divide an integer into an integer");
		System.out.println("5 .Exit");
		Scanner sc = new Scanner(System.in);
		m_num = sc.nextInt();
		
		switch(m_num)
		{
		case 1 : addNumbers(); break;
		case 2:  subNumbers(); break;
		case 3:  multNumbers(); break;
		case 4:  divNumbers(); break;
		case 5:  break;
		default : System.out.println("1~5의 수를 누르세요");
		}
		
	}
	public class getNumbers{
		int s1,s2;
	
		public int getFirstNumber(){
			return s1;
		}
		public void setFirstNumber(){
		
			System.out.println("Input first number:");
			Scanner sc = new Scanner(System.in);
			s1 = sc.nextInt();
			this.s1 = s1;
		}
		public int getSecondNumber(){
			return s2;
		}
		public void setSecondNumber(){
			System.out.println("Input Second number:");
			Scanner sc = new Scanner(System.in);
			s2 = sc.nextInt();
			this.s2 = s2;
		}
	    getNumbers()
		{
			setFirstNumber();
			getFirstNumber();
			setSecondNumber();
			getSecondNumber();
		}
		
	}
	
	public void addNumbers() {
		int sum;
		getNumbers g = new getNumbers();
		sum = g.getFirstNumber() + g.getSecondNumber();
		System.out.println(""+ g.getFirstNumber() +" + " + g.getSecondNumber() + " = " + sum);
	}
	
	public void subNumbers() {
		int sub;
		getNumbers g = new getNumbers();
		sub = g.getFirstNumber() - g.getSecondNumber();
		System.out.println(""+ g.getFirstNumber() +" - " + g.getSecondNumber() + " = " + sub);
	}
	public void multNumbers() {
		int mul;
		getNumbers g = new getNumbers();
		mul = g.getFirstNumber() * g.getSecondNumber();
		System.out.println(""+ g.getFirstNumber() +" * " + g.getSecondNumber() + " = " + mul);
	}
	public void divNumbers() {
		double div;
		getNumbers g = new getNumbers();
		div = g.getFirstNumber() / g.getSecondNumber();
		System.out.println(""+ g.getFirstNumber() +" + " + g.getSecondNumber() + " = " + div);
	}
	





	
	
}
