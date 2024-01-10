package Files;
import java.io.*;

public class Vowels_cons_F7 {

	public static void main(String[] args) {
		try {
		FileInputStream f= new FileInputStream("S.txt");
		String s="";
		int k=0;
		while((k=f.read())!=-1) {
			s+=(char)k;
			
			
		}
		int v=0;
		int c=0;
		int d=0;
		int s1=0;
		int w=1;
		for(int i=0; i<s.length();i++) {
					
			
			if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' || s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				v++;
				
				
				
			}
			else if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z')) {
				
				c++;
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				d++;
			}
			else if(s.charAt(i)==' ') {
				w++;
			}
			else {
				s1++;
			}
		
		
		
		}
		System.out.println("vowels" + " " +v);
		
		System.out.println("consonants"+c);
		System.out.println("digits"+d);
		System.out.println("words" +w);

		System.out.println("special"+s1);

		
		
	
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
