import java.util.Scanner;
public class day11{
public static void main(String[] args){
// fsp assignment : BASIC CALCULATOR

int n1,n2,res=0,opt;
Scanner optn=new Scanner(System.in);
System.out.println("Enter 1st number : ");
n1=optn.nextInt();
System.out.println("Enter 2nd number : ");
n2=optn.nextInt();
System.out.println("Menu : \n1)'+'\n2)'-'\n3)'*'\n4)'/'\n5)'%'\nEnter Your Choice : ");
opt=optn.nextInt();
if(opt>5 || opt<1){
System.out.println("INVALID INPUT !!!");
}
else{
if(opt==1){
res=n1+n2;
}
else if(opt==2){
res=n1-n2;
}
else if(opt==3){
res=n1*n2;
}
else if(opt==4){
res=n1/n2;
}
else if(opt==5){
res=n1%n2;
}
System.out.println("The result of the calculation = "+res);
}
}
}