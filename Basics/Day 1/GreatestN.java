import java.util.Scanner ;
class GreatestN{
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        int temp = 0;
        for (int i = 1 ; i <= 4 ; i++){

            System.out.print(" enter number "+i + "  : " );
            int num = sc.nextInt();
            if (num > temp )
                
                {
                temp = num;
            
            }

        }
        System.out.println(temp);
        sc.close();



    }
}
