package com.edu.strings;

public class pracrice1 {
	public static void main(String[] args) {
		String A="hello";
		String B="java";
System.out.println(A.length()+B.length());
if(A.compareTo(B) < 0)
{
    System.out.println("No");
    A = A.substring(0,1).toUpperCase() + A.substring(1,A.length());
    B = B.substring(0,1).toUpperCase() + B.substring(1,B.length());
    System.out.println(A + " " + B);
}
else if (A.compareTo(B)==0)
{
    System.out.println("No");
    A = A.substring(0,1).toUpperCase() + A.substring(1,A.length());
    B = B.substring(0,1).toUpperCase() + B.substring(1,B.length());
    System.out.println(A + " " + B);
}
else
{
    System.out.println("Yes");
    A = A.substring(0,1).toUpperCase() + A.substring(1,A.length());
    B = B.substring(0,1).toUpperCase() + B.substring(1,B.length());
    System.out.println(A + " " + B);
}
	}

}
