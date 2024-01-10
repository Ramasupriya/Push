package Files;
import java.io.FileOutputStream;

public class F1 {

	public static void main(String[] args) {
		try {
			
		
		FileOutputStream f=new FileOutputStream("S1.txt");
		f.write(65);
		f.close();
		System.out.println("Success");
	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
