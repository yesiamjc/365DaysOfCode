import java.util.Scanner;
class game{
public int doubleKaro(int k){
return k*2;
}
}
class day49{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int j;
System.out.println("Enter an integer :");
j=sc.nextInt();
game g=new game();
System.out.println("Doubled value of the integer you entered : "+g.doubleKaro(j));
}
}