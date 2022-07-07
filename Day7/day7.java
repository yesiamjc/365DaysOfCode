// e-Ticket System :
public class day7{
public static void main(String[] args){
int ticketPrice=90;
int age=13;
boolean isStudent=false;
if(isStudent){
ticketPrice=45;
}
else{
if(age<=15){
ticketPrice=30;
}
else if(age>=60){
ticketPrice=35;
}
}
int opt=2;
String door;
switch(opt){
case 1: door="HALLWAY";
  break;
case 2: door="MilkmaidRoad";
  break;
case 3: door="CinemaMen";
  break;
case 4: door="Line Show";
  break;
default: door="INVALID TICKET !!!";
  break;
}
System.out.println("Your ticket price would be "+ticketPrice+" and ticket way arround is "+door);
}
}