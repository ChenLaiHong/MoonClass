package thread;

/**
 * Created by CHLaih on 2018/9/20.
 */
//创建和启动线程，传统有两种方式
//方式1：继承Thread类
/*
* 1、定义一个类继承Thread类
* 2、在类中覆盖Thread类中的run方法
* 3、我们在run方法中编写需要执行的操作--->run方法里的。也就是线程执行体
* 4、在main方法（线程）中，创建线程对象，并启动线程
* 注意：千万不要调用run方法，如果调用run方法好比是对象调用方法，依然还是只有一个线程
* 并没有开启新的线程
* */
class  MusicThread extends java.lang.Thread{

    public void run() {
        for(int i = 0;i < 100; i++){
            System.out.println("播放音乐"+ i);
        }
    }
}
public class Demo2 {

    public static void main(String[] args) {
        for(int i = 0;i < 100; i++){
            System.out.println("启动游戏"+ i);
            if (i == 20) {
                //创建线程对象，并启动线程
                MusicThread musicThread = new MusicThread();
                musicThread.start();
            }
        }
    }
}
