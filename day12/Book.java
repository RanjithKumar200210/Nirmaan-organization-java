package day12;

public class Book {
String title;
String author;
double price;
int numberOfCopies;
public Book() {
	
}
public Book(String title,String author,double price,int numberOfCopies) {
this.title=title;
this.author=this.author;
this.price=price;
this.numberOfCopies=numberOfCopies;
}

public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getNumberOfCopies() {
	return numberOfCopies;
}
public void setNumberOfCopies(int numberOfCopies) {
	this.numberOfCopies = numberOfCopies;
}
public String toString() {
	return "Title:"+title+"\nAuthor:"+author+"\nPrice:"+price+"\nNumber of copies:"+numberOfCopies;
}
}
