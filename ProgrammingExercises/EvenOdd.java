import java.util.Scanner;

/**
 * Created by jc300556 on 23/08/17.
 */
public class EvenOdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number");
        int number = input.nextInt();

        if(number % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
