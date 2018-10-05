package thread;

/**
 * Created by CHLaih on 2018/10/5.
 * 同步方法
 */
class Apple2 implements Runnable {
    private int num = 50;

    //synchronized 不能修饰run方法
    //把需要同步的代码放到新定义的方法中
    synchronized private void eat(){
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
    @Override
   synchronized public void run() {
        // 同步代码块
        for (int i = 0; i < 50; i++) {
             eat();
        }
    }
}
public class SynchronizedMethod {
    public static void main(String[] args) {
        Apple2 apple = new Apple2();
        new Thread(apple, "小A").start();
        new Thread(apple, "小B").start();
        new Thread(apple, "小C").start();
    }
}
