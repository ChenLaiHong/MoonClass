package compute;

import java.util.Scanner;

/**
 * Created by CHLaih on 2018/4/20.
 *
 * °F = (9/5)*°C + 32
 */
public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int output =(int) ((input-32)*5/9);
        System.out.print(output);
    }
}
