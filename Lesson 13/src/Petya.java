import java.io.*;
/**
 * Created by vig on 11/14/16.
 */
public class Petya implements Externalizable {
    private transient String name; //transient - поле не будет сериализовано, но externalizable игнорирует это
    private int age;


    public Petya(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //must be for deserialization reason
    public Petya() {
    }


    @Override
    public void writeExternal(ObjectOutput out)
            throws IOException {
            new Write
            out.writeUTF(this.name);
            out.writeInt(this.age);
    }

    @Override
    public void readExternal(ObjectInput in)
            throws IOException, ClassNotFoundException {
        this.name = in.readUTF();
        this.age = in.readInt();
    }
}
