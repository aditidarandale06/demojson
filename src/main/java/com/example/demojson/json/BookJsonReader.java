package com.example.demojson.json;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BookJsonReader {
	
	public void bookreader() {
		// TODO Auto-generated method stub
		System.out.println("I am in book reader method");
		
		ObjectMapper objectMapper=new ObjectMapper();
		
		File bookjsonfile=new File("src/main/resources/book.json");
		Book book = null;
		try {
			book = objectMapper.readValue(bookjsonfile, Book.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(book);
		System.out.println("Book title:" +book.getAuthor());
		System.out.println("Book title:" +book.getCountry());
		System.out.println("Book title:" +book.getImageLink());
		System.out.println("Book title:" +book.getLanguage());
		System.out.println("Book title:" +book.getPages());
		System.out.println("Book title:" +book.getTitle());
		book.setTitle("Java 11 working");
		System.out.println("Book title:" +book.getTitle());
		System.out.println("Book title:" +book.getYear());
		
		//Reading 2 file that is list of json entries 
		File booksjsonfile =new File("src/main/resources/books.json"); 
		booksjsonfile.getPath();
		
		try {
			List<Book> books = objectMapper.readValue(booksjsonfile, new TypeReference<List<Book>>() {});
			System.out.println(Arrays.asList(books));
			for(Book b : books) {
				System.out.println(b.getTitle());
			}
			
			System.out.println("After sorting --------");
			
			Collections.sort(books, new Comparator<Book>() {
			    public int compare(Book book1, Book book2) {
			        return book1.getTitle().compareTo(book2.getTitle());
			    }
			});
			
			for(Book b : books) {
				System.out.println(b.getTitle());
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}

}
