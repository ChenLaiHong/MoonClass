package day;

/**
 * Created by CHLaih on 2018/9/26.
 */
public class Test {
    public static void main(String[] args) {
        int[] array = {2,4,6,8,10};
        int size = 6;
        int result = -1;
        try {
            for(int i = 0; i < size && result == -1;)
                if(array[i] == 20) result = i;
        }catch (ArithmeticException e){
            System.out.println("---1");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.print("----2");
        }catch (Exception e){
            System.out.print("----3");
        }

    }
}
