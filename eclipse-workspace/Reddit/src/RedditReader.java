import java.io.*;
public class RedditReader {
	String fileToAnalyze;
	RedditReader()
	{
		System.out.println("Default constructor");
		fileToAnalyze="";
	}
	boolean detectRussia(String linetoAnalyze)
	{
		if (linetoAnalyze.contains("russia"))
		{
			System.out.println("detected russia");
			
			return true;
			
			
		}
		else
		{
			//System.out.println("no russia");
			return false;
		}
	
		
	}
	
	void readRedditFile(String fileToRead) {
		
		System.out.println("Ready to read "+fileToRead);
		try
		{
			
			FileReader myFileReader=new FileReader(fileToRead);
			System.out.println("I was able to open your file!");
			BufferedReader myBufferedReader=new BufferedReader(myFileReader);
			System.out.println("Read to start buffering!");
			String line=null;
			
		
			line=myBufferedReader.readLine();
			System.out.println(line);
			line=myBufferedReader.readLine();
			System.out.println(line);
			line=myBufferedReader.readLine();
			System.out.println(line);
			//while ((myBufferedReader.readLine()))
		
		}
		catch(Exception ex)
		{
			System.out.println("I don't think I was able to run this file");
		}
	}	
}
