import java.util.Scanner;
class cal{
String input;
public void input(){
Scanner cl=new Scanner(System.in);
System.out.println("Enter the statement : ");
input=cl.nextLine();
}
public void display(){
System.out.println("Your Statement was : \n"+input);
}
}
public class day26{
public static void main(String[] args){
cal c=new cal();
c.input();
c.display();
}
}