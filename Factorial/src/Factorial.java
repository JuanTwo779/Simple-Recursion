import java.util.Scanner;

public class Factorial
{
    public Factorial()
    {}

    //method to do the calculations
    public int genFactorial(int num)
    {
        if (num == 0)//base case, when num hits 0, method stops by returning 1 (not num)
            return 1;//one takes over method return; final call value is multiplied by 1
        else
            return num * genFactorial(num - 1);
    }

    public static void main(String[] args)
    {
        Factorial fact = new Factorial();
        fact.startDemo();
    }

    public void startDemo()
    {
        boolean cont = true;
        int num = 0;
        do
        {
            System.out.println("Please enter a positive integer (10 or below)");
            try
            {
                Scanner console = new Scanner(System.in);
                num = Integer.parseInt(console.nextLine());
                if (num > 10)
                    System.out.println("Max number of sequence is 10");
                else if (num < 0)
                    System.out.println("Please enter a positive number");
                else
                    cont = false;
            }
            catch(Exception e)
            {
                System.out.println("Please enter a numeric value only");
            }
        } while(cont);

        System.out.println("The factorial of " + num + " = " + genFactorial(num));
    }
}
