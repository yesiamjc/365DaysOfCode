import java.util.Scanner;
class laptop{
private double price,ram,displaySize;
private String modelName,processor;
public void input(){
Scanner s1=new Scanner(System.in);
Scanner s2=new Scanner(System.in);
System.out.println("\t\t\t Enter Laptop Specification \t\t\t");
System.out.println("Enter laptop price : ");
price=s1.nextDouble();
System.out.println("Enter laptop RAM(in GB) : ");
ram=s1.nextDouble();
System.out.println("Enter laptop display size(in inches) : ");
displaySize=s1.nextDouble();
System.out.println("Enter laptop model name : ");
modelName=s2.nextLine();
System.out.println("Enter laptop processor : ");
processor=s2.nextLine();
}
public void display(){
System.out.println("\t\t\t Your Laptop Specs Are \t\t\t");
System.out.println("Price : "+price);
System.out.println("RAM : "+ram);
System.out.println("Display Size : "+displaySize);
System.out.println("modelName : "+modelName);
System.out.println("Processor : "+processor);
}
}
public class day23{
public static void main(String[] args){
laptop lp=new laptop();
lp.input();
lp.display();
}
}