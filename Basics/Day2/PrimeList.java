import java.util.Scanner;

class PrimeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit: ");
        int n = sc.nextInt();

        System.out.print("Prime numbers up to " + n + ": ");
        for (int num = 2; num <= n; num++) {
            int count = 0;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}
