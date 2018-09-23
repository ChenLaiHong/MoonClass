package thread;

/**
 * Created by CHLaih on 2018/9/23.
 * 使用实现Runnable方式来实现三个同学吃50个苹果比赛
 */
class Apple implements Runnable{
    private int num = 50;

    @Override
    public void run() {
        for (int i = 0; i < 50; i++){
            if(num > 0){
                System.out.println(Thread.currentThread().getName()+"吃了编号为"+ num-- +"的苹果");
            }
        }
    }
}
public class ImplementsAppleDemo {
    public static void main(String[] args) {
        Apple apple = new Apple();
        new Thread(apple,"小A").start();
        new Thread(apple,"小B").start();
        new Thread(apple,"小C").start();

    }
}
//使用实现接口方式三个人一共吃了50个，因为他们共用一个对象
//java中类是单继承的，如果继承了Thread了，该类就不能再有其他的直接父类了
//操作上分析，继承方式简单，获取线程名字也简单
//java中类可以多实现接口，此时该类还可以继承其他类，并且可以实现其他接口
