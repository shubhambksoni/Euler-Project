
class EvenFibonacciNumbers
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int zero=1;
		int one=2;
		int sum=2;
		for(int i=zero+one;i<=4000000;i=zero+one){
			if(i%2==0)sum+=i;
			zero=one;
			one=i;
		}
		System.out.println(sum);
	}
}
