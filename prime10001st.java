//This is solution of Euler Project Problem 7
import java.util.Scanner;

public class prime10001st {

	public static void main(String[] args) {
		boolean[] arr=prime(200000);
		int i=0;
		for(int j=2;j<arr.length;j++){
			if(arr[j]){
				i++;
			}
			if(i==10001){
				System.out.println(j);
				break;
			}
		}
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
