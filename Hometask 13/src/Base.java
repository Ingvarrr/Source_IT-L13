import java.util.ArrayList;

/**
 * Created by vig on 1/8/17.
 */
public class Base<T>{

    public int min(Integer [] a){
        int lowest = a[0];
        for (int i = 0; i <a.length ; i++) {
            if (a[i] <a[lowest]) lowest = a[i];
        }
        return lowest;
    }

    public double avg(Integer [] a){
        double avg = 0;
        for (int i = 0; i <a.length ; i++) {
            avg += a[i];
        }
        avg = avg/a.length;
        // вывод результата с округлением до двух знаков после запятой
        return (double)(int)(((avg*100) - (int) avg*100) >= 0.5d ? avg*100 + 1 : avg*100) / 100;
    }

    public int max(Integer [] a){
        int highest = a[0];
        for (int i = 0; i <a.length ; i++) {
            if (a[i] >a[highest]) highest = a[i];
        }
        return highest;
    }

}
