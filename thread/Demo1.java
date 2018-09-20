package thread;

import java.io.IOException;

/**
 * Created by CHLaih on 2018/9/20.
 */
//在java中如何开启进程
public class Demo1 {
    public static void main(String[] args) throws IOException {
        //方式1，使用Runtim类的exec方法
        Runtime runtime = Runtime.getRuntime();
        //打开记事本
        runtime.exec("notepad");

        //方式2，使用ProcessBuilder类的start方法
        ProcessBuilder processBuilder = new ProcessBuilder("notepad");
        processBuilder.start();
    }
}
