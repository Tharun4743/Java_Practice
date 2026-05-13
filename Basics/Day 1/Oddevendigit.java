import java.util.Scanner;

class Oddevendigit {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int num = sc.nextInt(); // 12345

        int ecount = 0;
        int ocount = 0;

        while (num > 0) {

            int rem = num % 10; // last digit

            if (rem % 2 == 0) {
                ecount++;
            } else {
                ocount++;
            }

            num = num / 10;
        }

        System.out.println("Even digits = " + ecount);
        System.out.println("Odd digits = " + ocount);
        sc.close();
    }
}