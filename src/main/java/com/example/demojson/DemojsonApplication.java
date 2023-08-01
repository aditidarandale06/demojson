package com.example.demojson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demojson.json.BookJsonReader;

@SpringBootApplication
public class DemojsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemojsonApplication.class, args);
		BookJsonReader bookJsonReader=new BookJsonReader();
		bookJsonReader.bookreader();
		
		
		
	}

}
