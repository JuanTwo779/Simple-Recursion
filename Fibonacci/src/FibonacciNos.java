import java.util.*;

public class FibonacciNos {
    private int n1;
    private int n2;
    private int n3;

    public FibonacciNos() {
        n1 = 0;
        n2 = 0;
        n3 = 0;
    }

    public void nextFibo(int num) {
        if (num > 0) //input greater than 0
        {
            if ((n1 == 0) && (n2 == 0) && (n3 == 0)) //start of sequence, numbers have no values (0)
            {
                n1 = 1;
                n2 = 1;
                System.out.print(0 + ", " + n1 + ", " + n2);
                if (n3 <= num) //max val, method ends
                {
                    nextFibo(num); //call again
                }
            } else //numbers are not 0s anymore, this part of method repeats until max is hit
            {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                if (n3 <= num) //max val, method ends
                {
                    System.out.print(", " + n3);
                    nextFibo(num);
                }
            }
        } else if (num == 0) //input is 0
            System.out.println("0");
    }

    public int getNum()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value less than 10000");
        int num = Integer.parseInt(scan.nextLine());
        return num;
    }

    public static void main(String[] args) {
        FibonacciNos obj = new FibonacciNos();
        int num = obj.getNum();
        obj.nextFibo(num);
    }
}