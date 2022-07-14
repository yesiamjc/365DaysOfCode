import java.util.Scanner;
class rectangle{
private double length,bredth,area,perimeter;
public void input(){
Scanner sc =new Scanner(System.in);
System.out.println("~~ Area & Perimeter Finder ~~\nEnter length : ");
length=sc.nextDouble();
System.out.println("Enter bredth : ");
bredth=sc.nextDouble();
}
public void calculate(){
area=length*bredth;
perimeter=2*(length+bredth);
}
public void display(){
System.out.println("The area will be : \n"+area+"\nThe perimeter will be : \n"+perimeter);
}
public static void main(String[] args){
rectangle r=new rectangle();
r.input();
r.calculate();
r.display();
}
}