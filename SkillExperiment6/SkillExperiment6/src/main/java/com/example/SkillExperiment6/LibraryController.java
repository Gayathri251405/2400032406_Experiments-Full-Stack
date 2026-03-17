package com.example.SkillExperiment6;
import java.awt.print.Book;
import java.util.*;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
	@GetMapping("/Welcome")
	public String show() {
		return "Welcome to spring controller";
	}
	@GetMapping("/Count")
	public int totalBooks() {
		return 100;
	}
//Create a method mapped to /price that returns
//a sample book price as double
	@GetMapping("/price")
	public int bookprice() {
		return 1000.d;
	}	
	// Create a method mapped to /books using
	//@GetMapping that
	//return a list of book titles.
	String booknames[]= {"java","dotnet","react"};
	
	@GetMapping("/books")
	public List<String >bookTitles()
	{
		return Arrays.asList(booknames);
	}
	//6.Create a method mapped to /books/{id}
	//using @GetMapping and return book details using
	//@PathVariable
	@GetMapping("/books/{id}")
	public String bookDetails(@PathVariable int id)
	{
		return "The book details are "+id;
	}
	
	@GetMapping("/search")
	public String display(@RequestParam String title)
	{
		return "The title is "+title;
	}
	
	@GetMapping("/author/{name}")
	public String displayAuthor(@PathVariable String name)
	{
		return "The author name is "+name;
	}
	
	List<Book> booklist=new ArrayList<>();
	
	@PostMapping("/addbook")
	public void addBook(@RequestBody Book b) {
		booklist.add(b);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
