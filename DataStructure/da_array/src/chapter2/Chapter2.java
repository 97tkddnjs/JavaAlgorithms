package chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Chapter2 {
    
    // 동적 배열을 통해 radix number을 구현하고자 함
    public  static ArrayList<String> radixNum(int input , int r){
        String data = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int tmp;
        ArrayList<String> chlist = new ArrayList<String>();
        System.out.println("input = " + input + " r "+r +"  op "+input%r);
        do{
            tmp = input%r;
            System.out.println("tmp = " + tmp);
            chlist.add(String.valueOf(data.charAt(tmp)));
            input = input/r;
        }while(input != 0);

        Collections.reverse(chlist);
        return chlist;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int radix = sc.nextInt();

        ArrayList<String> strings = radixNum(num, radix);
        strings.forEach(data ->System.out.print(data));


    }
}
