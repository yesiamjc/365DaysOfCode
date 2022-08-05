import java.util.Scanner;
class day36{
private int a;
void input(){
Scanner s=new Scanner(System.in);
a=s.nextInt();
}
void display(){
System.out.println("Inputed number was "+a);
}
public static void main(String[] args){
day36 d=new day36();
d.input();
d.display();;
}
}
