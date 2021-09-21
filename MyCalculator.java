package daythree;


public class MyCalculator implements AdvArithmetic {
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator num=new MyCalculator();
		System.out.println("the sum of the givin number divisors are"+num.divisorSum(6));

	}

	
	@Override
	public int divisorSum(int n) {
		int sum=0,i;
		for(i=1;i<=(n+1);i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}

}
