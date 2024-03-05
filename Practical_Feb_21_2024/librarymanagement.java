class Staff{
	static int availableBooks;
	
	private boolean issueBooks(String bookTitle , String id){
		if(booksissued(id)<=issueBooks(id)){
			--availableBooks;
			return true;
		}
		return false;
	}
	
	int decrementBookCount(String bookTitle){
	return --bookTitle;
	}
	

}
