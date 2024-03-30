	package bank;
import java.util.*;
public class Palindrome {
static int Rev(int n) {
	int sum=0;
	int rev=0;
	while(n>0) {   //123
	int r=n%10;
	sum=sum*10+r;
	n/=10;
		
		
	}
	return sum;
	
}
	
		
		
	
	public static void main(String[] args) {
		
		Scanner o=new Scanner (System.in);
		// TODO Auto-generated method stub
System.out.println("Give a Number");
int n=o.nextInt();
	int Res=Rev(n);
	if(Res==n)
	System.out.println(n+" is Palindrome");
	else
		System.out.println(n+" is Not palindrome");
	}
	
	

}
