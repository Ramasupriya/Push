package Files;
import java.io.FileInputStream;
public class F4_read {

	public static void main(String[] args) {
		
		try {
			FileInputStream f=new FileInputStream("S.txt");
			int i=0;
			while((i=f.read())!=-1) {
				System.out.println(i);
				System.out.println((char)i);
			}
			f.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	
	}
}
