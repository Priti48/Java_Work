import java.util.Scanner;
class Fibonacci
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n1=0,n2=1,n3=0,num,i;
        System.out.println("Enter the number");
        num=sc.nextInt();
        System.out.println(n1);
        System.out.println(n2);
        for(i=2;i<=num;i++)//Loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
         
    }
}