import java.io.*; //input and output library
public class TesterReddit {
	public static void main(String[] args)
	{
	 System.out.println("Hello world");
	 String fileName="redditPost.txt";
	 
	 
	 
	 
	 try // do dangerous thing, try it out if it works. if thing goes wrong tell user.
	 {
		
		 
		 RedditReader myReader=new RedditReader();
		 FileReader myFileReader=new FileReader(fileName); 
		System.out.println("I was able to open your file!");
		BufferedReader myBufferedReader=new BufferedReader(myFileReader);
		System.out.println("Read to start buffering!");
		
		
		String line=null;
		while((line=myBufferedReader.readLine())!=null) 
		{
			if (myReader.detectRussia(line)==true)
				System.out.println("line:"+line);
			//System.out.println("line:"+line);	
			
		}
		System.out.println("exited while");
		
		//line=myBufferedReader.readLine();
		//System.out.println(line);
		//line=myBufferedReader.readLine();
		//System.out.println(line);
		//line=myBufferedReader.readLine();
		//System.out.println(line);
		//while ((myBufferedReader.readLine()))
		
		//RedditReader myreader=new RedditReader();
		//myreader.readRedditFile("RedditPost.txt");
	 }
	 catch(Exception ex)
	 {
		 System.out.println("Sorry I was not able to find the file");

	 }
	
	 
	}
	
}
