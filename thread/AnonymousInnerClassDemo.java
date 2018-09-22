package thread;

/**
 * Created by CHLaih on 2018/9/22.
 * 匿名内部类，只适用于某个类只使用一次的情况
 */
public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 300; i++) {
            System.out.println("启动游戏" + i);
            if (i == 30) {
                //创建线程对象，并启动线程
                new Thread() {
                    public void run() {
                        for (int j = 0; j < 50; j++) {
                            System.out.println("播放电影" + j);
                        }
                    }

                    ;
                }.start();
            }
        }
    }
}
