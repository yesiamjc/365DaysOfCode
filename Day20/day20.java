import java.util.Scanner;
public class day20{
public static void main(String[] args){
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number : ");
n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter array elements : ");
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
System.out.println("Display inputed array elements : ");
for(int i=0;i<n;i++){
System.out.print(arr[i]+" ");
}
}
}