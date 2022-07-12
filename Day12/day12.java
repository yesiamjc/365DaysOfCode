import java.util.Scanner;
public class day12{
public static void main(String[] args){
int a,b;
char ch;
Scanner myObj=new Scanner(System.in);
System.out.println("Enter num1 : ");
a=myObj.nextInt();
System.out.println("Enter num2 : ");
b=myObj.nextInt();
System.out.println("Enter y/n : ");
ch=myObj.next().charAt(0);
System.out.println(ch+" - add "+a+" + "+b+" "+(a+b));
}
}
//😁👍
