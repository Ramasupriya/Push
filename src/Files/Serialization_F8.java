package Files;
import java.io.*;
public class Serialization_F8 {

	public static void main(String[] args) {
		try {
		Serialization_1 s= new Serialization_1("RAju",342);
		FileOutputStream f=new FileOutputStream("T4.txt");
		ObjectOutputStream o=new ObjectOutputStream(f);
		o.writeObject(s);
		f.close();
		o.close();
		
	}
		catch(Exception e) {
			e.printStackTrace();
		}

}


}