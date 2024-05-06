import java.io.*;
import java.util.*;
class FileEx{
	public static void main(String args[]) throws Exception{
 
	    File newfile = new File("newfile.txt");
	    newfile.createNewFile();
	    File newfile1 = new File("newfile2.txt");
	    newfile1.createNewFile();
	    newfile1.deleteOnExit();
    
	    Scanner read =new Scanner(newfile);
	    while(read.hasNextLine()){
	    	String data=read.nextLine();
	    	System.out.println(data);
	    }   
		read.close();
    
 
	FileWriter Writer= new FileWriter("myfile.txt");
            Writer.write("Files in java");
            Writer.close();
    
   
	}
}
