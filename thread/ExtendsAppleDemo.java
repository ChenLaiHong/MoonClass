package thread;

/**
 * Created by CHLaih on 2018/9/22.
 * 使用继承方式来实现三个同学吃50个苹果的比赛
 */
//每一个同学好比一个线程对象
    class Person extends Thread{
        private int num = 50;

        public Person(String name){
            super(name);
        }
        public void run(){
            for (int i = 0; i < 50; i++){
                if(num > 0){
                    System.out.println(super.getName()+"吃了编号为"+ num-- +"的苹果");
                }
            }
        }
}
public class ExtendsAppleDemo {
    public static void main(String[] args) {
        //创建三个线程
        new Person("小A").start();
        new Person("小B").start();
        new Person("小C").start();
    }
}
//使用继承方式实现，每个编号都被每个同学吃一遍