package compute;

import java.util.Scanner;

/**
 * Created by CHLaih on 2018/4/20.
 * UTC是世界协调时，BJT是北京时间，UTC时间相当于BJT减去8。
 * 输入格式:
 一个整数，表示BJT的时和分。整数的个位和十位表示分，百位和千位表示小时。如果小时小于10，则没有千位部分；如果小时是0，则没有百
 位部分；如果小时不是0而且分小于10分，需要保留十位上的0。

 输出格式：
 一个整数，表示UTC的时和分。整数的个位和十位表示分，百位和千位表示小时。如果小时小于10，则没有千位部分；如果小时是0，则没有百
 位部分；如果小时不是0而且分小于10分，需要保留十位上的0。

 输入样例：
 933

 输出样例：
 133
 */
public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int hour = Integer.parseInt(input)/100;
        String mimut = (input+"").substring(input.length()-2,input.length());
        String output ="";
        if(hour<8){
            output=24+hour-8+mimut;

        }else {
            output=hour-8+mimut;
        }
        System.out.print(output);
    }
}
