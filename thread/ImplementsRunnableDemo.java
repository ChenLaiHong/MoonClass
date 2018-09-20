package thread;

/**
 * Created by CHLaih on 2018/9/20.
 */
/*
* 1、定义一个类A实现Runnable接口，注意A类不是线程类
* 2、在A类中覆盖Runnable接口中的run方法
* 3、我们在run方法中编写需要执行的操作--->run方法里的。也就是线程执行体
* 4、在main方法（线程）中，创建线程对象，并启动线程
* 创建线程对象：   Thread t new Thread(new A());
* 调用线程对象的start方法    t.start();
* */
//播放音乐的类
class MusicRunnable implements java.lang.Runnable{

    public void run() {
        for(int i = 0;i < 100; i++){
            System.out.println("播放音乐"+ i);
        }
    }
}

public class ImplementsRunnableDemo {
    //主线程运行游戏
    public static void main(String[] args) {
        for(int i = 0;i < 100; i++){
            System.out.println("启动游戏"+ i);
            if (i == 30) {
                //创建线程对象，并启动线程
                Runnable target = new MusicRunnable();
                Thread thread = new Thread(target);
                thread.start();
            }
        }
    }
}
