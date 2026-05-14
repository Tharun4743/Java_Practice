import java.util.Scanner;

class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int rev = 0, rem;

        while (num > 0) {
            rem = num % 10;       // extract last digit
            rev = rev * 10 + rem; // append digit to reversed number
            num = num / 10;       // remove last digit
        }

        System.out.println("Reversed number = " + rev);
        sc.close();
    }
}
