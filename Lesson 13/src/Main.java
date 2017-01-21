import java.io.*;
import java.io.IOException;
import java.util.Objects;

/**
 * Created by vig on 11/14/16.
 */
public class Main {
    public static void main(String[] args) throws Throwable{


        /*Reader reader = new BufferedReader(new FileReader (new File ("Lesson 13/src/Main.java")));
        String s = "Привет!";
        reader.mark(1);

        char symbol = (char) reader.read();
        reader.reset();
        System.out.println(symbol);
        char [] buf = new char[1000];
        reader.read(buf);
        for (Character c : buf){
            System.out.print(c);
        }

        Writer writer = new BufferedWriter(
                new FileWriter("test.txt"), 2);
        writer.append("При");
        writer.append("вет!");
        writer.flush();
        writer.append("Java");
        writer.close();*/

        Petya petya = new Petya("Petya", 20);

        ObjectOutputStream os = new ObjectOutputStream(
                new FileOutputStream("vasya.txt")
        );
        //os.writeObject(petya);
        petya.writeExternal(os);
        os.close();

        ObjectInputStream inputStream
                = new ObjectInputStream(
                new FileInputStream("vasya.txt")
        );
        petya = new Petya();
        petya.readExternal(inputStream);

        System.out.println("this is vasya");

    }

}
