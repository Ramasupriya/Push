package Files;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ByteArrayOutputStream;

public class F5_ByteArray {

	public static void main(String[] args) {
		try {
			
		
		FileOutputStream f= new FileOutputStream("T2.txt");
		
		FileOutputStream f1= new FileOutputStream("T3.txt");
		
		ByteArrayOutputStream fo=new ByteArrayOutputStream();
		
		fo.write(65);
		
		fo.writeTo(f);
		fo.writeTo(f1);
		f.close();
		f1.close();
		fo.close();

		}
		catch(Exception e)
		{
			e.getMessage();
		}

	}

}
