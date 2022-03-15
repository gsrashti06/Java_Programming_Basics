//18
public class Book {
	String Bookname;
    String ISBNnumber;
	String Authorname;
	String Publisher;
	public Book() {
		Bookname="null";
		ISBNnumber="null";
		Authorname="null";
		Publisher="null";
	}
	public Book(String bkname,String isbn,String authorname,String publisher ) {
		Bookname=bkname;
		ISBNnumber=isbn;
		Authorname=authorname;
		Publisher=publisher;
	}
	public void setBookName(int bkname ) {
		this.Bookname=Bookname;
	}
	public String getBookName() {
		return Bookname;
	}
	public void setISBNnumber(int isbn ) {
		this.ISBNnumber=ISBNnumber;
	}
	public String ISBNnumber() {
		return ISBNnumber;
	}
	public void setAuthorname(int authorname ) {
		this.Authorname=Authorname;
	}
	public String getAuthorName() {
		return Authorname;
	}
	public void setPublisher(int publisher ) {
		this.Publisher=Publisher;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void  getBookInfo() {
		//System.out.printf("%s %s %s %s",Bookname,ISBNnumber,Authorname,Publisher);
		System.out.println("The information of the Book : \nName of the Book : " +Bookname+"\nISBN number of the Book : " +ISBNnumber+"\nAuthor name of the Book : " +Authorname+"\nPublisher of the Book : " +Publisher);
		
	}
}
