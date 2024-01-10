package Files;
import java.io.*;
//import java.util.*;
public class Deserialize {

	public static void main(String[] args) {
		try {
		FileInputStream f= new FileInputStream("T4.txt");
		ObjectInputStream o=new ObjectInputStream(f);
		Serialization_1 s1=(Serialization_1)o.readObject();
		System.out.println(s1.s + " " +s1.n);
		
		
	}
		catch(Exception e) {
			
			e.printStackTrace();
		}

}
}