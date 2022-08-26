import java.util.Scanner;

class OddEven
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number");
        n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println(n+" is an Even Number.");
        }
        else
        {
            System.out.println(n+" is an Odd Number.");
        }
    }
}