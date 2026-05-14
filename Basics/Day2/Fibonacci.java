import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int a = 0, b= 1, c=0;
        while (a<=num) {
            System.out.print(" " + a);
            c= a+b;
            a=b;
            b=c;
             
        }

    
        

        System.out.println("Fibonacci number sum = " + c);
        sc.close();
    }
}
