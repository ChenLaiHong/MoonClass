package compute;

import java.util.Scanner;

/**
 * Created by CHLaih on 2018/5/9.
 * 题目内容：
 我们认为2是第一个素数，3是第二个素数，5是第三个素数，依次类推。
 现在，给定两个整数n和m，0<n<=m<=200，你的程序要计算第n个素数到第m个素数之间所有的素数的和，包括第n个素数和第m个素数。
 注意，是第n个素数到第m个素数之间的所有的素数，并不是n和m之间的所有的素数。

 输入格式:
 两个整数，第一个表示n，第二个表示m。

 输出格式：
 一个整数，表示第n个素数到第m个素数之间所有的素数的和，包括第n个素数和第m个素数。

 输入样例：
 2 4

 输出样例：
 15
 */
public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int num = 0;
        int sum = 0;
        boolean flag ;
        out:
       for(int i = 2;;i++){
           flag = false;
           for(int j=2 ;j<i;j++){
               if(i % j ==0){
                   flag = true;
                   break;
               }
           }
           if(flag == false){
               System.out.print(i+">");
               num++;
               if(n<= num && num <=m){
                   sum+=i;
               }

           }
           if(num == m){
               break out;
           }
       }
        System.out.print(sum);
    }
}
