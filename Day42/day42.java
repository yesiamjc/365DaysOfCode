class a{
public void pr(){
System.out.println("Statement 1");
}
}
class b{
public void rp(){
System.out.println("Statement 2");
}
}
class day42{
public static void main(String[] args){
a A=new a();
b B=new b();
B.rp();
}
}