import java.util.Scanner;
public class day12{
public static void main(String[] args){
int a,b;
char c;
Scanner myObj=new Scanner(System.in);
System.out.println("Enter 1st number : ");
a=myObj.nextInt();
System.out.println("Enter 2nd number : ");
b=myObj.nextInt();
System.out.println("Enter y/n : ");
c=myObj.next().charAt(0);
System.out.println(c+" - add "+a+" + "+b+" "+(a+b));
}
}