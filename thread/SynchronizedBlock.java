package thread;

/**
 * Created by CHLaih on 2018/10/5.
 * 同步代码块
 */
class Apple1 implements Runnable {
    private int num = 50;

    @Override
    public void run() {
        // 同步代码块
        for (int i = 0; i < 50; i++) {
            synchronized (this) {
                if (num > 0) {
                    System.out.println(Thread.currentThread().getName() + "吃了编号为" + num + "的苹果");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    num--;
                }
            }
        }
    }
}

public class SynchronizedBlock {
    public static void main(String[] args) {
        Apple1 apple = new Apple1();
        new Thread(apple, "小A").start();
        new Thread(apple, "小B").start();
        new Thread(apple, "小C").start();
    }
}
