import java.util.Scanner;

class PrimeNumber
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,flag=0;
        n=sc.nextInt();
        if(n==1)
        {
            flag=1;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
            
        }
        if(flag==1)
        {
            System.out.println(n +"is not a prime number");
        }
        else
        {
             System.out.println(n +"is a prime number");
    
        }

    }
}