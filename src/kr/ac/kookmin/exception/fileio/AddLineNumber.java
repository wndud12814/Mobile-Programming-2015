package kr.ac.kookmin.exception.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 Makes numbered.txt the same as original.txt, but with each line numbered.
 */
public class AddLineNumber
{
	public static void main(String[] args)
	{
		try
		{
			BufferedReader inputStream = 
					new BufferedReader(new FileReader("C:\\original.txt"));
			PrintWriter outputStream = 
					new PrintWriter(new FileOutputStream("C:\\numbered.txt"));
			
			String line = null;
			int i=1;
			while((line =inputStream.readLine())  != null){
				outputStream.println(i+" "+line);
				i++;
			}
			inputStream.close( );
			outputStream.close( );
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
