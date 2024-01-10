package Files;
import java.io.FileInputStream;
import java.io.ByteArrayInputStream;
import java.io.*;
public class F6_ByteArray {

	public static void main(String[] args) {
		try {
			//FileInputStream f= new FileInputStream("S.txt");
			
			byte[] b= {35,36,38,34};
			
			ByteArrayInputStream f1=new ByteArrayInputStream(b);
			int i=0;
			while((i=f1.read())!=-1) {
				System.out.print(i);
				//char c=(char)i;
				System.out.println((char)i);
			}
			
		}
		catch(Exception e) {
			e.toString();
		}

	}

}
