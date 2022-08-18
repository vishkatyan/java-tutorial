import java.util.Scanner;
public class functions {
  public static void number(int a){
        if(a%2 == 0){
            System.out.println("Even Number");
        } else{
            System.out.println("Odd Number");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        number(a);
    }
}
