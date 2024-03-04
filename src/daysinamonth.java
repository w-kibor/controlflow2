import java.util.Scanner;
public class daysinamonth {
    public static int year;
public static void main(String[] args) {
    System.out.println("Enter the year");
  isLeapYear();  
}
public static void isLeapYear(){
    @SuppressWarnings("resource")
    Scanner in=new Scanner(System.in);
    year=in.nextInt();
if (year<1 && year>9999) {
    System.out.println("false");
}
if (year%4==0) {
   System.out.println("True"); 
}
else
{
    System.out.println("false");
}
}
}
