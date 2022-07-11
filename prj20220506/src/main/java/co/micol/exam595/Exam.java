package co.micol.exam595;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class Exam {
	public static void main(String[] args) {
		try {
		//	OutputStream os = new FileOutputStream("c:\\temp\\a.txt");
			Writer os = new FileWriter("c:\\temp\\a.txt");
//			byte a = 65;
//			byte b = 66;
//			byte c = 67;
			String str = "java";
		
			int a = 40;
			int b = 50;
			int c = 60;
			os.write(str);
			os.write(a);
			os.write(b);
			os.write(c);
	 
			os.flush();
			os.close();
			//아스키코드로들어감
		
			
			Reader rd = new FileReader("c:\\temp\\a.txt");
			
			char [] buffer = new char[100];
			while(true) {
				int charNum = rd.read(buffer);
				if(charNum == -1)break; //파일끝을만나면EOF
				for(int i=0;i<charNum;i++) {
					System.out.println(buffer[i]);
				}
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
