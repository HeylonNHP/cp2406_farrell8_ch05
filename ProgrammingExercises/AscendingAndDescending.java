import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by jc300556 on 23/08/17.
 */
public class AscendingAndDescending {
    public static void main(String[] args){
        int[] inputs = new int[3];
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < inputs.length; i++){
            System.out.println(String.format("i: %s", i));
            inputs[i] = input.nextInt();
        }

        Arrays.sort(inputs);

        for (int number:inputs) {
            System.out.println(number);
        }

        int[] reversedInput = new int[3];

        for(int i = inputs.length; i >= 0; i--){

        }

    }
}
