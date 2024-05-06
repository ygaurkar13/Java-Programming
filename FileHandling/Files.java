import java.io.*;
class Files{


	public static void main(String args[]){
		Files file=new Files();
		file.setNumbersOfFilesAndFolders("./FileHandling");
	}
	
	public void setNumbersOfFilesAndFolders(String path){
		File fe= new File("./FileHandling");		
		System.out.println(fe.getName());
		System.out.println(fe.getParent().length());
		System.out.println(fe.getParentFile());
		System.out.println(fe.getPath());
		System.out.println(fe.getAbsolutePath());
		
	}
}
