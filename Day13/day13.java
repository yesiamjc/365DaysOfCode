import java.util.Scanner;
public class day13{
public static void main(String[] args){
int a;
System.out.println("Guess Game : \nEnter the number between(0-9) : ");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
if(a==7){
System.out.println("Nice Guess the number is "+a);
}else{
System.out.println("Try again !!!");
}
}
}