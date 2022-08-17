import java.lang.Math;
import java.util.Scanner;
class guessIt{
double x;
Scanner s=new Scanner(System.in);
public void check(double g){
System.out.println("\t\t\tWelcome To Guess Game");
do{
System.out.println("Enter a non-zero number to check : ");
x=s.nextDouble();
if(x!=0){
if(x==g)
System.out.println("Congrats !!! You won");
else{
if(x<g)
System.out.println("You have entered a smaller value,the number was "+g);
else
System.out.println("You have entered a higher value,the number was "+g);
System.out.println("\t\t\tType zero to exit.");
}
}
else
System.out.println("Bye bye !!!");
}while(x!=0);
}
}
class day48{
public static void main(String[] args){
double k=Math.random();
guessIt gi=new guessIt();
gi.check(k);
}
}