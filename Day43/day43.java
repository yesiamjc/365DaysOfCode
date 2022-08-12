class subject{
String name;
void hehe(){
System.out.println(" & I love math.");
}
}
class math extends subject{
void display(){
System.out.print("I am "+name);
}
}
class day43{
public static void main(String[] args){
math human=new math();
human.name="Joy";
human.display();
human.hehe();
}
}