package day;

import java.util.Scanner;

/**
 * Created by CHLaih on 2018/9/11.
 * 输入一个数字，输出十行由输入的数字一直乘从1到10的式子
 */
public class SecondDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for(int i = 1; i<= 10; i++){
            System.out.println(input + " x " + i + " = " + (input * i));
        }
    }
}
