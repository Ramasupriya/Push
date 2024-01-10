package Files;
//import java.io.FileOuputStream;
import java.io.FileOutputStream;
public class F2 {

	public static void main(String[] args) {
		try {
			
		
		FileOutputStream f= new FileOutputStream("S.txt");
		String s= "welcome to @#123 Mss";
		byte b[]=s.getBytes();
		f.write(b);
		f.flush();
		f.close();
		
	}
		catch(Exception e) {
			
		e.printStackTrace();
		}
		}
	

}
