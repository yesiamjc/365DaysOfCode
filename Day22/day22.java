class cal{
int a,b,c;
void add(){
c=a+b;
System.out.println(a+" + "+b+" = "+c);
}
void sub(){
c=a-b;
System.out.println(a+" - "+b+" = "+c);
}
void mul(){
c=a*b;
System.out.println(a+" x "+b+" = "+c);
}
void div(){
c=a/b;
System.out.println(a+" / "+b+" = "+c);
}
void rem(){
c=a%b;
System.out.println(a+" % "+b+" = "+c);
}
}
public class day22{
public static void main(String[] args){
cal c=new cal();
c.a=10;
c.b=5;
c.add();
c.sub();
c.mul();
c.div();
c.rem();
}
}