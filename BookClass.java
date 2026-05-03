package Assignments;

class Book{
	String  title;
	String author;
  static String libraryName ="City Library";
  final int ISBN;
  String subTitle="Atomic";

 	Book(String title,String author,int ISBN)
 	{
	this.title = title;
	this.author = author;
	this.ISBN= ISBN;
 	}
 	
 	void display()
 	{
 		System.out.println("Title :"+" "+title);
 		System.out.println("Author :"+" "+author);
 		System.out.println("ISBN:"+" "+ISBN);
 	}
 	
 	void getDescription() {
 		 
 		System.out.println("This is a Physical book");
 		
 	}
 	static void showLibrary() {
 		System.out.println("Library: "+ libraryName);
 		
 	}
}
 	class EBook extends Book{
 		int fileSize;
 		EBook(String title,String author,int ISBN ,int fileSize){
 			super(title,author,ISBN);
 			
 			this.fileSize=fileSize;
 		}
 		@Override
 		void display()
 	 	{
 			super.display();
 	 		System.out.println("FileSize:"+" "+fileSize);
 	 		System.out.println("This is an electronic book.");
 	 		System.out.println(this.title.toUpperCase());
 	 		System.out.println("Title length:" + this.title.length());
 	 		System.out.println(this.title.contains(this.subTitle));
 	 	}
 	}
public class BookClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EBook book = new EBook("Atomic Habits","James Clear",12345,5);
		book.showLibrary();
		//book.ISBN =23455;
		book.display();
		book.getDescription();
	}

}
