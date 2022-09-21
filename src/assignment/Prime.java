package assignment;


import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,m=0,flag=0;
int num;
Scanner scan= new Scanner(System.in);
System.out.println("enter the number");
num= scan.nextInt();
m= num/2;
if(num==0||num==1)
{
	System.out.println(num+"is not prime number");
}else {
	for(i=2;i<=m;i++) {
		if(num%i==0) {
			System.out.println(num+"is prime number");
			flag=1;
			break;
		}
	}
	if(flag==0) {
		System.out.println(num+"is prime number");
	}
}
	}

}

