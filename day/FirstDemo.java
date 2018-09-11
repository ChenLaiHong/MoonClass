package day;

import java.util.Scanner;

/**
 * Created by CHLaih on 2018/7/23.
 */
public class FirstDemo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            String temp = x+"";

            while(s1.length() != 15){
                s1 += " ";
            }
            while(temp.length() != 3){
                temp = 0 + temp;
            }

            System.out.println(s1+temp);
            //Complete this line
        }
        System.out.println("================================");


    }
}
