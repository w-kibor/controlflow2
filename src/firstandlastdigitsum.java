import java.util.Scanner;
public class firstandlastdigitsum {
    public static int number, i, n;
@SuppressWarnings("resource")
public static void main(String[] args) {
    System.out.println("Enter number");
    Scanner input=new Scanner(System.in);
    number=input.nextInt();
 sumFirstAndLastDigit();   
}
public static void sumFirstAndLastDigit(){
//n is the last digit
//i is the first digit  output=(a+n)
if (number<0) {
    System.out.println("-1");
}
int n=0;
int i=0;
n=number%10;
System.out.println("last number"+ n);
while(number!=0){
    i=number;
    number=number/10;
}
System.out.println("first number"+ i);
System.out.println(i+n);
}
}
