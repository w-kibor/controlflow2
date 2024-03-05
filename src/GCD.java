import java.util.Scanner;
public class GCD {
    public static int first,second;
    public static int g;
@SuppressWarnings("resource")
public static void main(String[] args){
    System.out.println("Enter two numbers");
    Scanner input=new Scanner(System.in);
    first=input.nextInt();
    second=input.nextInt();
getGreatestCommonDivisor();
}
public static int getGreatestCommonDivisor(){
   
if (first<10 && second<10) {
    return -1;
}

for(int i=1;i<=first&&i<=second;i++){
    if(first%i==0 && second%i==0)
    g=i;
}
System.out.println(g);
return first;
}
}
