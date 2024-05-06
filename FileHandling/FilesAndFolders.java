import java.io.*;

class FilesAndFolders {
    static int JavaFilesCount;
    static int classFileCount;
    static int pngFilesCount;
    static int otherFiles;
     static int folderCount;

    public static void main(String[] args) {
        FilesAndFolders f = new FilesAndFolders();
        f.getNumberOfFilesAndFolders("Home/Desktop/Project");
        System.out.println("JavaFiles:"+JavaFilesCount);
        System.out.println("ClassFiles:"+classFileCount);
        System.out.println("PNGFiles:"+pngFilesCount);
        System.out.println("otherFiles:"+otherFiles);
        System.out.println("FolderSCount:"+folderCount);
        
    }

	public static void getNumberOfFilesAndFolders(String path) {
		File folder = new File(path);
		File files[] = folder.listFiles();

		for(int i=0;i<files.length;i++){
			if(files[i].exists()){
				if(files[i].isFile()){
						String filename=files[i].toString();
					
					if(filename.endsWith("java")){
						JavaFilesCount++;
					}
						  else if(filename.endsWith("class")){
						    classFileCount++;
						  }
							  else if(filename.endsWith("png")){
							    pngFilesCount++;
							  }
								  else if(filename.contains(".")){
								    otherFiles++;
								  }            
				}
					else{
						String foldername=files[i].toString();
							if(foldername.endsWith("git") || foldername.endsWith("md")){
						  
									}
							else{
								folderCount++;
								getNumberOfFilesAndFolders(foldername);
							}
		      			}
		    	}
		 }
	}
}

