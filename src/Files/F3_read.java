package Files;
import java.io.FileInputStream;
public class F3_read {

	public static void main(String[] args) {
		try {
		FileInputStream f= new FileInputStream("S1.txt");
		
int i=f.read();
System.out.println(i);
System.out.println((char)i);

//f.flush();
f.close();
		
	}
		catch(Exception e) {
		System.out.println(e);

}}}
