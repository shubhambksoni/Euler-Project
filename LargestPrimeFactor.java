class LargestPrimeFactor
{
	public static void main (String[] args) throws java.lang.Exception
	{
		long num=600851475143L;
		long newnum=600851475143L;
		long largest=0;
		long factor=2;
		while(factor*factor<=num){
			if(newnum%factor==0){
				largest=factor;
				newnum/=factor;
			}else{
				factor=(factor%2==0)?3:factor+2;
			}
		}
		if(newnum>largest){   // the remainder is a prime number
			largest=newnum;
		}
		System.out.println(largest);
	}
}
