import java.util.Scanner;
public class day16{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a,b,c;
String nam;
System.out.println("Enter your name : ");
nam=sc.nextLine();
System.out.println("Enter your age : ");
a=sc.nextInt();
System.out.println("Enter your height : ");
b=sc.nextInt();
System.out.println("Enter your weight : ");
c=sc.nextInt();
System.out.println("The name is "+nam+" with age "+a+",height "+b+" & weight "+c);
}
}