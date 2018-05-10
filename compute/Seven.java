package compute;

import java.util.Scanner;

/**
 * Created by CHLaih on 2018/5/10.
 * 题目内容：
 你的程序要读入一个整数，范围是[-100000,100000]。然后，用汉语拼音将这个整数的每一位输出出来。
 如输入1234，则输出：
 yi er san si
 注意，每个字的拼音之间有一个空格，但是最后的字后面没有空格。当遇到负数时，在输出的开头加上“fu”，如-2341输出为：
 fu er san si yi

 输入格式:
 一个整数，范围是[-100000,100000]。

 输出格式：
 表示这个整数的每一位数字的汉语拼音，每一位数字的拼音之间以空格分隔，末尾没有空格。

 输入样例：
 -30

 输出样例：
 fu san ling
 */
public class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String[] world = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
        int num = sc.nextInt();
        if(num<0){
           System.out.print("fu ");
           num = -num;
        }
        String flag = num+"";
        String[] result = new String[flag.length()];
        for(int j=0;j<flag.length();j++){
            for(int i=0;;i++){
                if(num%10 ==i){
                   result[j]=world[i];
                    num /= 10;
                   break;
                }
            }
        }
        for(int i=result.length-1;i>=0;i--){
            if(i !=0){
                System.out.print(result[i]+" ");
            }else
            System.out.print(result[i]);
        }

    }
}
