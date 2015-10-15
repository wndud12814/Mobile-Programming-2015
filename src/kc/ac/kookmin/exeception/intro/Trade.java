package kc.ac.kookmin.exeception.intro;
import java.io.*;

public class Trade {
	public void readFile(){
		try{
			BufferedReader inputStream = 
					new BufferedReader(new FileReader("C:\\a.txt"));
			String line = null;

			while((line =inputStream.readLine())  != null){

				System.out.println(line);
			}
			inputStream.close();
		}
		catch(Exception ex){
			System.out.println(ex);
		}
	}
}
