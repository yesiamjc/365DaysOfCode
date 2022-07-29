import java.util.Scanner;
class pc{
private int a,b,c=0;
public void input(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number : ");
a=sc.nextInt();
System.out.println("Enter another number : ");
b=sc.nextInt();
}
public void calculate(){
c=a+b;
}
public void display(){
System.out.println("The sum of "+a+" & "+b+" is "+c);
}
}
public class day29{
public static void main(String[] args){
pc p=new pc();
p.input();
p.calculate();
p.display();
}
}