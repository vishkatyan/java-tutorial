import java.util.Scanner;
public class functions {
   public static void prime(int a){
        int count = 0;
        for (int i = 1; i <= a; i++)
        {
            if (a % i == 0)
                count += 1;
        }
        if (count > 2)
            System.out.println ("The given is number " + a + " is not prime");

        else
            System.out.println ("The given is number " + a + " is prime");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
       prime(a);
    }
}
