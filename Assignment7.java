package Assignments;

class Book{
	String  title;
	String author;


 	Book(String title,String author)
 	{
	this.title = title;
	this.author = author;
 	}
 	
 	void display()
 	{
 		System.out.println("Title :"+" "+title);
 		System.out.println("Author :"+" "+author);
 	}
}
 	class EBook extends Book{
 		int fileSize;
 		EBook(String title,String author,int fileSize){
 			super(title,author);
 			this.fileSize=fileSize;
 		}
 		@Override
 		void display()
 	 	{
 			super.display();
 	 		System.out.println("FileSize:"+" "+fileSize);
 	 		
 	 	}
 	}
public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EBook book = new EBook("Atomic Habits","James Clear",5);
		book.display();
	}

}
