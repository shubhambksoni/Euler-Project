import java.util.Scanner;
//This also calculates the LCM of numbers from 1 to n
public class SmallestMultiple {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i=in.nextInt();
		int n=1;
		boolean[] arr=prime(i);
		
		int[] arr2=new int[i+1];
		for(int l=2;l<arr2.length;l++){
			if(arr[l]){
				int po=0;
				int num=i;
				while(num>=l){
					num=num/l;
					po++;
				}
				n=n*(int)Math.pow((double)l, (double)po);
			}
		}
		System.out.println("\n"+n);
	}
	
	public static boolean[] prime(int j){
		boolean[] arr=new boolean[j+1];
		arr[0]=false;
		for(int i=1;i<arr.length;i++){
			arr[i]=true;
		}
		int k=(int) Math.sqrt((double) j);
		for(int i=2;i<=k;i++){
			if(arr[i]==true){
				for(int num=i*i;num<=j;num+=i){
					arr[num]=false;
				}
			}
		}
		return arr;
	}

}
