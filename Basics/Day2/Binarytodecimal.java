import java.util.Scanner ;
class Binarytodecimal{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in );
        System.out.println(" enter number ");
        int num = sc.nextInt();
        int sum = 0;
        int rem = 0;
        int count =0;
        while (num >0){
            rem = num %10;
            int prod = (int) (rem * Math.pow (2,count));
            sum += prod;

            num = num / 10;
            count ++;


        }
        System.out.println(" binary to decimal = " + sum);
        sc.close();
    }
}
