import java.util.Scanner;
class Geeks
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("input number of minutes ");
        a=sc.nextInt();
        b=a/525600;
       c=a%525600;
       c=c/1440;
       
         System.out.println(a + " minutes is equal to " + b + " years " + "and " + c  + " days ");
        
          
        
    }
}
