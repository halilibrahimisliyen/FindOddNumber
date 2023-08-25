import java.util.Scanner;




public class FindOdd{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int k;
        int total=0;
        do {
            System.out.println("Please enter a number: ");
            k=input.nextInt();
            if(k > 0 && k % 2 != 0){
                total =total+k;
            }
        } while (k>0);
        
       System.out.println(total);

        }
        

    }
