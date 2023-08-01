package com.example.demojson.json;

import java.io.File;
import java.io.IOException;

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
		
	
	}

}
