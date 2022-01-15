import java.util.StringTokenizer;
import java.io.*;
public class fileread {

	public static void main(String[] args) throws IOException {
		
FileReader file = new FileReader("C:\\Users\\USER\\Desktop\\ofc.txt");
BufferedReader bf=new BufferedReader(file);
String s=bf.readLine();
while((s=bf.readLine())!=null)
{
	StringTokenizer st = new StringTokenizer(s);
	
	  String r=st.nextToken();
	  String n=st.nextToken(); 
	  System.out.println(r);
	  System.out.println(n);
	 
}
	}
}
