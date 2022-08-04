class arr{
int arr[];
arr(){
arr=new int[]{1,2,3,4,5};
}
}
class day35{
public static void main(String[] args){
arr a =new arr();
for(int i=0;i<5;i++)
System.out.println(a.arr[i]);
}
}