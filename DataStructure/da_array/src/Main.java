import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        
        //int[] a = new int[10];
        //Integer[] b = new Integer[5];

        int[] height = new int[num];
        System.out.println("height is that");

        for (int i = 0; i < height.length; i++) {
            height[i] = 100+ random.nextInt(90); // random에 바운드를 준다.
            System.out.println("height[i] = " + height[i]);
        }
        System.out.println(Arrays.stream(height).max());

        int max_idx = height.length-1;
        for(int i = 0; i< (height.length)/2 ; i++ ){
            int tmp =  height[i];
            height[i] = height[max_idx-i];
            height[max_idx-i] = tmp;
        }
        System.out.println("reverse");
        for (int i = 0; i < height.length; i++) {
            //height[i] = 100+ random.nextInt(90); // random에 바운드를 준다.
            System.out.println("height[i] = " + height[i]);
        }
    }
}