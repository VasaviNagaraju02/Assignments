package assignment;

import java.util.Scanner;
public class Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print("enter a character:");
Scanner sc=new Scanner(System.in);
char chr=sc.next().charAt(0);
int asciiValue= chr;
System.out.println("ASCII VALUE OF"+chr+"is"+asciiValue);
	}

}
