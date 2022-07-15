import java.util.Scanner;
class person{
private int age;
private String name;
public void input(){
Scanner s=new Scanner(System.in);
Scanner sc=new Scanner(System.in);
System.out.println("Your age ?");
age=s.nextInt();
System.out.println("Your Name ?");
name=sc.nextLine();
}
public person greater(person j){
if (age>j.age)
return this;
else
return j;
}
public void display(){
System.out.println(name+" is old as age is "+age);
}
public static void main(String[] args){
System.out.println("Older one finder : ");
person k1=new person();
person k2=new person();
person k3=new person();
k1.input();
k2.input();
k3=k1.greater(k2);
k3.display();
}
}