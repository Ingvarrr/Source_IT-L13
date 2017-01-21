import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by vig on 12/16/16.
 */
public class Main {
    public static void main(String[] args) {
        Wrapper<Integer> array1 = new Wrapper<>(10);
        Base calc = new Base();
        array1.add(1);
        array1.add(2);
        array1.add(3);
        array1.add(4);
        //проверяем размер массива
        System.out.println(array1.getSize());
        array1.printArray();
        array1.remove(1);
        //выводим массив с удаленным элементом
        array1.printArray();
        //распечатка в консоль avg,min,max методов класса Base, применимых к обертке массива Integer array1
        System.out.println(calc.avg(array1.toIntArray()));
        System.out.println(calc.min(array1.toIntArray()));
        System.out.println(calc.max(array1.toIntArray()));
        //проверка класса массива в обертке
        System.out.println(array1.toIntArray().getClass());
        //создание массива строк,добавление,удаление его элементов, распечатка и проверка класса массива в обертке
        Wrapper<String> array2 = new Wrapper<>(10);
        array2.add("1");
        array2.add("abc");
        array2.add("1abc");
        array2.remove(2);
        array2.printArray();
        System.out.println(array2.toStringArray().getClass());
    }
}
