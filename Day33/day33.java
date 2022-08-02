class hehe{
public void hi(int a){
System.out.println("Passed parameter "+a);
}
public void hi(int i,int j){
System.out.println("Passed parameters "+i+","+j);
}
}
public class day33{
public static void main(String[] args){
hehe h = new hehe();
h.hi(9);
h.hi(1,2);
}
}