package compute;

/**
 * Created by CHLaih on 2018/6/17.
 */
public class FirstDay {
    public static void main(String[] args) {
        /**定义整型变量，先写变量类型再写变量名称，等号右边是变量值
         * int是整型的意思
        */
        int num = 4;  //定义整型num的值为4
        int num2 = 5;  //定义整型num2的值为5
        int num3 = -11;

        //两个整型的操作得到的也是整型
        int result = num + num2;       //将num和num2的和赋值给int型变量result
        int result2 = num * num2;      //将num和num2的乘积赋值给int型变量result2
        int result3 = num2 - num;      //将num2减num的值赋值给int型变量result3
        int result4 = num2 / num;      //将num2除num的值赋值给int型变量result4
        int result5 = num3 / num;      //将num3除num的值赋值给int型变量result5

        //输出结果,用双引号括住的内容是直接输出的
        System.out.println("result:"+result);
        System.out.println("result2:"+result2);
        System.out.println("result3:"+result3);
        System.out.println("result4:"+result4);      //计算机除法中两个正整数相除是只取整数部分的
        System.out.println("result5:"+result5);

        //double是用来定义小数的，定义小数的还有一个关键字float,double是定义双精度小数的（具体后面说双精度和单精度问题）
        double number = 1.2;
        double number2 = 4.5;
        double number3 = -8.0;

        //double与double之间的操作结果也是double类型
        double result6 = number + number2;
        double result7 = number2 - number;
        double result8 = number3 / number;
        double result9 = number * number2;

        //输出double之间操作的结果
        System.out.println("result6:"+result6);
        System.out.println("result7:"+result7);
        System.out.println("result8:"+result8);   //结果跟平时学的数学不一样，因为这是跟计算机有关的，所以就会有双精度和单精度之分
        System.out.println("result9:"+result9);



    }
}
