
import java.util.*;
import java.io.*;
public class Palindrome {
	public static int fact(int n) {
		if(n==1)return 1;
	return n*fact(n-1);
	}


	public static void main(String []a ) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>0) {
			int res=fact(num);
			System.out.println(res);
		}else {
			System.out.println("error");
		}
		
		
    }
}

