package bank;

import java.util.*;


public class Bank1 {
	
String Name;	
int age;
int phoneNumber;

	Bank1(String N,int a,int ph){
		Name=N;
	    age=a;
        phoneNumber=ph;
		System.out.println(phoneNumber);
		System.out.print(age);
				
	}
	
	

	 public static void main(String[] args) {
		 
		 Bank1 o=new Bank1("senthil",19,123);
		//System.out.println(o.Name);
		 //System.out.print(o.Name);
		
		 
	 }		
}