import java.util.Scanner;
public class numberinwords {
    public static int a;
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println("Enter an integer value");
        Scanner input=new Scanner(System.in);
a=input.nextInt();
     printNumberInWord();   
    }
    public static void printNumberInWord(){

if(a==0)
{
    System.out.println("ZERO");
}        
else if(a==1)
{
    System.out.println("ONE");
}        
else if(a==2)
{
    System.out.println("TWO");
}        
else if(a==3)
{
    System.out.println("THREE");
}        
else if(a==4)
{
    System.out.println("FOUR");
}        
else if(a==5)
{
    System.out.println("FIVE");
}        
else if(a==6)
{
    System.out.println("SIX");
}        
else if(a==7)
{
    System.out.println("SEVEN");
}        
else if(a==8)
{
    System.out.println("EIGHT");
}        
else if(a==9)
{
    System.out.println("NINE");
}        
else
{
    System.out.println("other");
}        
    }

}
