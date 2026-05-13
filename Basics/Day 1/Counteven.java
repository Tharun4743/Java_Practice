import java.util.Scanner ;
class Counteven{
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        int count = 0;
        for (int i = 1 ; i <= 4 ; i++){

            System.out.print(" enter number "+i + "  : " );
            int num = sc.nextInt();
            if (num % 2 ==0)
                
                {
                count ++;
                
            
            }

        }
        System.out.println(count);
        sc.close();



    }
}
