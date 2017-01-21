import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by vig on 1/8/17.
 */
public class Wrapper<T extends Object>  {
    Object[] array;
    private int size;

    public int getSize() {
        return this.size;
    }

    private final Object[] EMPTY_ARRAY = new Object[0];

    public Wrapper(int a) {
        if(a > 0) {
            this.array = new Object[a];
        } else {
            if(a != 0) {
                throw new IllegalArgumentException("Illegal Capacity: " + a);
            }
            this.array = EMPTY_ARRAY;
        }
    }
// добавление элементов определенного типа в массив
    public void add(T newElement){
        this.array = Arrays.copyOf(this.array, size + 1);
        this.array[this.size++] = newElement;
    }
    //удаление элемента по индексу с последующим сжатием массива
    public void remove(int elementIndex){
        int  a2 = this.size - elementIndex - 1;
        if(a2 > 0) {
            System.arraycopy(this.array, elementIndex + 1, this.array, elementIndex, a2);
        }
            this.array = Arrays.copyOf(this.array, size - 1);
        this.size--;
    }
    //преобразование массива объектов в массив чисел для дальнейшей работы с элементами
    public Integer[] toIntArray() {
        return Arrays.copyOf(this.array, this.size, Integer[].class);
    }
    //преобразование массива объектов в массив строк для дальнейшей работы с элементами
    public String[] toStringArray() {
        return Arrays.copyOf(this.array, this.size, String[].class);
    }
    //вывод массива в консоль
    public void printArray() {
        System.out.println("Here is your array at this moment: ");
        for (int i = 0; i< array.length;i++) {
            System.out.print(array[i]+"|");
        }
        System.out.println();
        System.out.println("------------------------------");
    }
}
