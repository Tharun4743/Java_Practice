import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = sc.nextInt();

        // leap year :  Divisible by 400  or divisible by 4 but not by 100 

        
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is NOT a Leap Year");
        }

        sc.close();
    }
}
