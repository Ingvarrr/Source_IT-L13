import java.io.Serializable;

/**
 * Created by vig on 11/14/16.
 */
public class Vasya implements Serializable{
    public static final long serialVersionUID = 11;
    // Serializable - один из методов сохранения объектов, Externalizable -второй метод
    private transient String name;
    private int age;
    private int weight = 90;

    public Vasya(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}
