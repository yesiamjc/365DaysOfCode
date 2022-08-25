import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
class day56{
public static void main(String[] args){
DateTimeFormatter d=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
LocalDateTime now=LocalDateTime.now();
System.out.println(d.format(now));
}
}