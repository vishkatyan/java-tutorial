import java.util.Scanner;
public class functions {
    public static void factorial(int n){
        if(n<0){
            System.out.println("Invalid number");
            return;
        }
        int factorial =1;
        for(int i=n; i>=1; i--){
            factorial = factorial*i;
        }
        System.out.println("The factorial of given no is:" +factorial);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();
        factorial(n);
    }
}
