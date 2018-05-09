package compute;

import java.util.Scanner;

/**
 * Created by CHLaih on 2018/5/9.
 */
public class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int numPlace = 1;    //数位
        int num = 1;       //二进制位值
        int sum = 0;
        while(input%10 != 0){
            int flagNum = input%10;
            if(flagNum%2==0 && numPlace%2 == 0 || flagNum%2 !=0 && numPlace%2 != 0){
                sum += num;
            }
                numPlace ++;
                num *= 2;
                input /= 10;
        }
        System.out.print(sum);
    }
}
