package intelligdata.JavaSerializer;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, ClassNotFoundException
    {
        Person p=new Person("Stephen","Salvatore");
        JavaSerializer<Person>  ser= new JavaSerializer<Person>();
        JavaDeserializer<Person> des=new JavaDeserializer<Person>();
        byte[] arr=ser.serialize(p);
        Person p2=des.deserialie(arr);
        System.out.println(p2);
    }
}
