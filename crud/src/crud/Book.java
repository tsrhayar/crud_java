package crud;

import java.util.ArrayList;

public class Book {

	private static int count = 0;
	private int id;
	private String title;
	private double price;

	public Book(int id, String title, double price) {
		this.id = count++;
		this.title = title;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + this.id + ", title=" + this.title + ", price=" + this.price + "]";
	}

	// add Book
	public static void addBook(Book book, ArrayList<Book> BookList) {
		BookList.add(book);
	}

	
	// update Book
		public static void updateBook(ArrayList<Book> BookList, int id, String title, int price) {
			for (int i = 0; i < BookList.size(); i++) {
				if (id == BookList.get(i).getId()) {
					BookList.get(i).setId(id);
					BookList.get(i).setTitle(title);
					BookList.get(i).setPrice(price);
				}
			}
		}
		
		// delete Book
		public static void deleteBook(ArrayList<Book> BookList,int id) {
			for (int i = 0; i < BookList.size(); i++) {
				if (id == BookList.get(i).getId()) {
					BookList.remove(i);
				}
			}
		}
}
