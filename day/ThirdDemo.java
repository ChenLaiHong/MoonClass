package day;

import java.util.Scanner;

/**
 * Created by CHLaih on 2018/9/11.
 * Math.pow(x,n)方法,表示x的n次幂
 * 例如：
 * 输入
 * 2
 * 0 2 10
 * 5 3 5
 *
 * 输出
 * 2 6 14 30 62 126 254 510 1022 2046
 * 8 14 26 50 98
 *
 * 输入第一行代表有两组数，第二行第一个是a,第二个是b,第三个是n
 * s0 = 0 + 1 * 2 = 2
 * s1 = 0 + 1* 2 + 2 * 2 = 6
 * .....
 * b与2的幂次方相乘
 */
public class ThirdDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result = 0;
            for(int j = 1; j <= n; j++){
                for(int k = 0; k < j; k++) {
                    result +=  Math.pow(2, k) * b;
                }
                System.out.print(a+result + " ");
                result = 0;
            }
            System.out.println();
        }
        in.close();
    }
}
