import java.util.Scanner;
class manPul{
private float a,b,c=0;
public void input(){
Scanner in = new Scanner(System.in);
System.out.println("Enter first number : ");
a=in.nextFloat();
System.out.println("Enter second number : ");
b=in.nextFloat();
}
public void calculateGCD(){
while(b!=0){
c=b;
b=a%b;
a=c;
}
c=a;
}
public void display(){
System.out.println("G.C.D is : "+ c );
}
}
public class day25{
public static void main(String[] args){
manPul mp=new manPul();
mp.input();
mp.calculateGCD();
mp.display();
}
}